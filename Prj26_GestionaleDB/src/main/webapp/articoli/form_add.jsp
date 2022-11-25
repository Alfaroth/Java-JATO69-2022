<div class="card my-3">
    <div class="card-body">
        <form action="articoli" class="col-lg-6 col-md-9"  method="post">
        
        <!--
		private String descrizione;
		private double prezzo;
		private String categoria;
		private int rimanenza;
		-->
		
        <div class="mb-3">
            <label for="descrizione">Descrizione</label>
            <input  class="form-control" type="text" name="descrizione" id="descrizione" placeholder="Descrizione">
        </div>
        
        <div class="mb-3">
            <label for="prezzo">Prezzo</label>
            <input  class="form-control" type="decimal(6,2)" name="prezzo" id="prezzo" placeholder="Prezzo">
        </div>
        
        <div class="mb-3">
            <label for="categoria">Categoria</label>
            <input  class="form-control" type="text" name="categoria" id="categoria" placeholder="Categoria">
        </div>
        
        <div class="mb-3">
            <label for="rimanenza">Rimanenza</label>
            <input  class="form-control" type="number" name="rimanenza" id="rimanenza" placeholder="Rimanenza">
        </div>
        
        <input type="submit" class="btn btn-primary mt-3" value="Add">
        
        </form>
    </div>
</div>