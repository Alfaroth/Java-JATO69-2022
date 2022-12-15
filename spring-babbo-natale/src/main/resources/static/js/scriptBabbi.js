function getAll() {
    console.log("sono in get");
    console.log("getAll-fetch");
    const URL = "/api/babbi";

    fetch(URL)
        .then(response => {
            return response.json();
        }) 
        .then(listaBabbi => {
            console.log(listaBabbi);
            printTable(listaBabbi, "babbi");

        })

        console.log("fine fetch");
}

function printTable(listaBabbi, babbi){

    console.log("Sono in print");
    let tbody = document.getElementById(babbi);
    tbody.innerHTML = "";

    for (const babbo of listaBabbi) {
        let tr = document.createElement('tr');
        
        for (const key in babbo) {

            if (key != "id") {

                if (Object.hasOwnProperty.call(babbo, key)) {
                    const element = babbo[key];
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