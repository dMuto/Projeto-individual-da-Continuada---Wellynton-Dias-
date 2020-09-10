package com.wellynton.projetoindividualwellyntondias;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mds")
public class MonstroDeDueloController {

     private List<Monstros> monstros = new ArrayList<>();

    @GetMapping("/monstros")
    public ResponseEntity getMonstros(){
        if (!monstros.isEmpty()){
          return ResponseEntity.ok(monstros);
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/monstros/recuperar/{id}")
    public ResponseEntity getAllMonstros(@PathVariable int id){

        if (!monstros.isEmpty()){

            return ResponseEntity.ok(monstros.get(id-1));

        }else {

            return ResponseEntity.notFound().build();

        }
    }

    @DeleteMapping("/monstros/excluir/{id}")
    public ResponseEntity excluirMonstros(@PathVariable int id){
       if (monstros.size() >= id){

           monstros.remove(id-1);
           return ResponseEntity.ok().build();

       }else {

           return ResponseEntity.notFound().build();

       }
    }

    @PostMapping("/adcionarMonstros/dragoes")
    public ResponseEntity adcionarDragao(@RequestBody Dragoes dragoes){

        monstros.add(dragoes);

        return ResponseEntity.created(null).build();

    }

    @GetMapping("/monstros/recuperarDragoes")
    public ResponseEntity getRecuperarDragoes(){

     List<Monstros> monstrosDragoes = monstros.stream()
             .filter(monstros1 -> monstros1.getTipo().equals("Dragão")).collect(Collectors.toList());

     if (!monstrosDragoes.isEmpty()){
         return ResponseEntity.ok(monstrosDragoes);
     } else {
         return ResponseEntity.noContent().build();
     }
    }

    @GetMapping("/monstros/recuperarDragoesEspecificos/{id}")
    public ResponseEntity recuperarDragoesEspecificos(@PathVariable int id){
        List<Monstros> monstrosDragoes = monstros.stream()
                .filter(monstros1 -> monstros1.getTipo().equals("Dragão")).collect(Collectors.toList());
        if (!monstrosDragoes.isEmpty()){
            return ResponseEntity.ok(monstrosDragoes.get(id-1));
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/adcionarMonstros/magos")
    public ResponseEntity adcionarMago(@RequestBody Magos magos){

        monstros.add(magos);

        return ResponseEntity.created(null).build();

    }


    @GetMapping("/monstros/recuperarMagos")
    public ResponseEntity getMagos() {
        List<Monstros> monstrosMagos = monstros.stream()
                .filter(monstros1 -> monstros1.getTipo().equals("Mago")).collect(Collectors.toList());

        if (monstrosMagos.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(monstrosMagos);
        }
    }

    @GetMapping("/monstros/recuperarMagosEspecificos/{id}")
    public ResponseEntity getMagosEspecificos(@PathVariable int id) {
        List<Monstros> monstrosMagos = monstros.stream()
                .filter(monstros1 -> monstros1.getTipo().equals("Mago")).collect(Collectors.toList());

        if (monstrosMagos.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(monstrosMagos.get(id-1));
        }
    }

    @PostMapping("/adcionarMonstros/cavaleiros")
    public ResponseEntity adcionarCavaleiro(@RequestBody Cavaleiro cavaleiros){

        monstros.add(cavaleiros);

        return ResponseEntity.created(null).build();
    }

    @GetMapping("/monstros/recuperarCavaleiros")
    public ResponseEntity getCavaleiros() {

        List<Monstros> monstrosCavaleiros = monstros.stream()
                .filter(monstro -> monstro.getTipo().equals("Cavaleiro")).collect(Collectors.toList());

        if (monstrosCavaleiros.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(monstrosCavaleiros);
        }
    }

        @GetMapping("/monstros/recuperarCavaleirosEspecificos/{id}")
        public ResponseEntity getCavaleirosEspecificos(@PathVariable int id){

            List<Monstros> monstrosCavaleirosEspecificos = monstros.stream()
                    .filter(monstro -> monstro.getTipo().equals("Cavaleiro")).collect(Collectors.toList());

            if (monstrosCavaleirosEspecificos.isEmpty()){
                return ResponseEntity.notFound().build();
            }else {
                return ResponseEntity.ok(monstrosCavaleirosEspecificos.get(id-1));
            }
        }
}
