package cl.duoc.registropersonas.controller;

import cl.duoc.registropersonas.model.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class PersonaController {

    private ObservableList<Persona> personas;//= FXCollections.observableArrayList();

    @FXML
    private Button btnguardar;

    @FXML
    private TableColumn<?, ?> colapellido;

    @FXML
    private TableColumn<?, ?> coledad;

    @FXML
    private TableColumn<?, ?> colnombre;

    @FXML
    private TableColumn<?, ?> colrut;

    @FXML
    private TableView<Persona> tblDatos;

    @FXML
    private TextField txtapellido;

    @FXML
    private TextField txtedad;

    @FXML
    private TextField txtnombre;

    @FXML
    private TextField txtrut;

    @FXML
    public void initialize(){
        /*Datos de Prueba*/
        List<Persona> people=new ArrayList<>();
        Persona personasample=new Persona("100","Wacoldo","Soto",21);
        people.add(personasample);
        System.out.println("PEOPLE: " + people.size());


        /*INICIALIZAR*/
        colrut.setCellValueFactory(new PropertyValueFactory<>("rut"));
        colnombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colapellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        coledad.setCellValueFactory(new PropertyValueFactory<>("edad"));

        personas=FXCollections.observableArrayList(people);
        System.out.println("PERSONAS: " + personas.size());
        tblDatos.setItems(personas);

    }

    @FXML
    public void guardar(){
        String rut=txtrut.getText();
        String nombre=txtnombre.getText();
        String apellido=txtapellido.getText();
        int edad=Integer.parseInt(txtedad.getText());
        Persona nueva=new Persona(rut,nombre,apellido,edad);
        personas.add(nueva);
        limpiar();
    }

    public void limpiar(){
        txtnombre.setText("");
        txtapellido.setText("");
        txtedad.clear();
        txtrut.clear();
    }


}
