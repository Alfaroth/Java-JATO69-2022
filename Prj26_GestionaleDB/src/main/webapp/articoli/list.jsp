<%@page import="model.Articolo"%>
<%@page import="java.util.List"%>
<h2 class="mt-5 display-6">Elenco</h2>

<% List<Articolo> elenco = (List<Articolo>) request.getAttribute("elenco"); %>

<div class="col-lg-9 col-md-9">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Descrizione</th>
        <th>Prezzo</th>
        <th>Dettaglio</th>
      </tr>
    </thead>
    <tbody>
  
      <% for (Articolo a : elenco){ %>
  
        <tr>
          <td><%= a.getDescrizione() %></td>
          <td><%= a.getPrezzo() %></td>
          <td>
            <a class="btn btn-sm btn-secondary" href="articoli?id=<%= a.getId() %>">
              <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-card-text" viewBox="0 0 16 16">
                <path d="M14.5 3a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-13a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5h13zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z"/>
                <path d="M3 5.5a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5zM3 8a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9A.5.5 0 0 1 3 8zm0 2.5a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5z"/>
              </svg>
              Scheda
            </a>
          </td>

  
        </tr>
  
        <% } %>
    </tbody>
  </table>
</div>
