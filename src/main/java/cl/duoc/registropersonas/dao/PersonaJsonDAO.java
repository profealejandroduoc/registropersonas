package cl.duoc.registropersonas.dao;

import cl.duoc.registropersonas.model.Persona;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class PersonaJsonDAO implements ICrudeable<Persona>{

    private static final Path ARCHIVO=
            Paths.get("src","main","resources","personas.json");
    private final Gson gson = new Gson();

    @Override
    public void create(Persona persona) throws IOException {
        List<Persona> people=readAll();
        people.add(persona);

        try(Writer writer = Files.newBufferedWriter(
                ARCHIVO,
                StandardCharsets.UTF_8 ,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING)){
            gson.toJson(people,writer);
        }
    }

    @Override
    public List<Persona> readAll() throws IOException {
        if (Files.notExists(ARCHIVO) || Files.size(ARCHIVO)==0){
            return new ArrayList<>();
        }

        try(Reader lector = Files.newBufferedReader(
                ARCHIVO, StandardCharsets.UTF_8)){
            Type tipo=new TypeToken<List<Persona>>(){}
                    .getType();

            List<Persona> personas=gson.fromJson(lector,tipo);
            return personas !=null?personas:new ArrayList<>();

        }

    }


}
