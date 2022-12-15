function getAll() {
    console.log("sono in get");
    console.log("getAll-fetch");
    const URL = "/api/doni";

    fetch(URL)
        .then(response => {
            return response.json();
        }) 
        .then(listaDoni => {
            console.log(listaDoni);
            printTable(listaDoni, "doni");

        }).catch(e=>console.log(e));

        console.log("fine fetch");
}

function printTable(listaDoni, doni){

    console.log("Sono in print");
    let tbody = document.getElementById(doni);
    tbody.innerHTML = "";

    for (const dono of listaDoni) {
        let tr = document.createElement('tr');
        
        for (const key in dono) {

            if (key != "id") {
                console.log("if");

                if (Object.hasOwnProperty.call(dono, key)) {
                    const element = dono[key];
                    let td = document.createElement("td");
                    td.innerHTML = element
                    tr.appendChild(td);
                }
                
            }

        }
        
        tbody.appendChild(tr);

    } 
    console.log("Esco dalla print");

}



getAll();