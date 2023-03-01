package com.backcar.backcar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backcar.backcar.modelo.Alquiler;
import com.backcar.backcar.service.AlquilerServicio;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class AlquilerController {
	 
    @Autowired
   private AlquilerServicio alquiserv;

   @GetMapping("/do/listar")
   public ResponseEntity<List<Alquiler>> getAll() {
       try {
           return new ResponseEntity<>(alquiserv.findByAll(), HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }

   }

   @GetMapping("/do/search/{id}")
   public ResponseEntity<Alquiler> getById(@PathVariable("id") Long id){
       try {
           return  new ResponseEntity<>(alquiserv.findById(id), HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
   }

   @PostMapping("/do/crear")
   public ResponseEntity<Alquiler> createReproducion(@RequestBody Alquiler cancion){
       try {
           return new ResponseEntity<>(alquiserv.save(cancion), HttpStatus.CREATED);
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }

   }

   @DeleteMapping("/do/delete/{id}")
   public ResponseEntity<?> deletesong(@PathVariable("id") Long id) {
       try {
           alquiserv.delete(id);
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }catch (DataIntegrityViolationException e){
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al elminar al docente");
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
   }
}
