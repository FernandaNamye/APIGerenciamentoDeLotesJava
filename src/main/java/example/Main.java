package example;

import io.javalin.Javalin;
import example.controller.LoteController;

public class Main {
    public static void main(String[] args) {

        var app = Javalin.create().start(7070);

        app.get("/lotes", LoteController::listar);
        app.post("/lotes", LoteController::criar);




        System.out.println("🚀 Servidor online e aguardando o Postman em http://localhost:7070/lotes");
    }
}