<%@page import="model.Articolo"%>
<h2 class="mt-5 display-6">Dettaglio</h1>

<% Articolo a = (Articolo) request.getAttribute("dettaglio");  %>

<div id="dettaglio" class="card">

    <div class="card-header">
        <h2><%= a.getDescrizione() %></h2>
    </div>
    <div class="card-body">
        <dl> 
            <div class="description-list">
                <dt>
                    Cat.:
                </dt>
                <dd><%= a.getCategoria() %></dd>
            </div>
            <div class="description-list">
                <dt>
                    &euro;:
                </dt>
                <dd><%= a.getPrezzo() %></dd>
            </div>
            <div class="description-list">
                <dt>
                    Rim.:
                </dt>
                <dd><%= a.getRimanenza() %></dd>
            </div>

        </dl> 
    </div>
    
</div>