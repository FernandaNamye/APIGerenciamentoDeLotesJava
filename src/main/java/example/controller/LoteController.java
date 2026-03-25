package example.controller;

import example.dao.LoteDao;
import example.model.Lote;
import io.javalin.Javalin;
import java.util.List;
import java.util.ArrayList;

import io.javalin.http.Context;

public class LoteController {

    private static  LoteDao dao= new LoteDao();

    public static  void criar(Context ctx) {
        try {
            Lote novoLote = ctx.bodyAsClass(Lote.class);
            dao.salvar(novoLote);
            ctx.status(201).result("Lote salvo com sucesso!");

        }

        catch (Exception e) {
            ctx.status(500).result("Erro: " + e.getMessage());
        }
    }
    public static void listar(Context ctx) {

        ctx.json(dao.listarTodos());
    }

}
