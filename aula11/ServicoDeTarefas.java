package aula10;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class ServicoDeTarefas {

    private ArrayList<Tarefa> Tarefas = new ArrayList<>();

    // /tasks -> Para listar todas as tasks
    // /tasks/add -> Para adicionar nova tarefa
    // /tasks/edit/{taskId} -> Para editar uma tarefa
    // /tasks/delete/{taskId} -> Para remover uma tarefa.

    @POST
    @Path("/tasks")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response listarTarefas(Tarefa tarefinha) {

    }
    
}
