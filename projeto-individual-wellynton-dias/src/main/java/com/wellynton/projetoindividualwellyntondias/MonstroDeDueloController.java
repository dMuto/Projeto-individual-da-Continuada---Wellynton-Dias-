package com.wellynton.projetoindividualwellyntondias;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mds")
public class MonstroDeDueloController {

    private List<Monstros> monstros = new ArrayList<>();
    private List<Dragoes> monstrosDragoes = new ArrayList<>();
    private List<Magos> monstrosMagos = new ArrayList<>();
    private List<Cavaleiro> monstrosCavaleiros = new ArrayList<>();

    @GetMapping("/monstros")
    public List<Monstros> getMonstros(){
        return monstros;
    }

    @GetMapping("/monstros/recuperar/{id}")
    public Monstros getAllMonstros(@PathVariable int id){

        return monstros.get(id-1);

    }

    @DeleteMapping("/monstros/excluir/{id}")
    public void excluirMonstros(@PathVariable int id){
        monstros.remove(id-1);
    }

    @PostMapping("/adcionarMonstros/dragoes")
    public void adcionarDragao(@RequestBody Dragoes dragoes){

        monstros.add(dragoes);
        monstrosDragoes.add(dragoes);

    }

    @GetMapping("/monstros/recuperarDragao/{id}")
    public Dragoes getDragao(@PathVariable int id){

        return monstrosDragoes.get(id-1);

    }

    @DeleteMapping("/monstros/excluir/dragoes/{id}")
    public void excluirDragoes(@PathVariable int id){
        monstrosDragoes.remove(id-1);
    }

    @PostMapping("/adcionarMonstros/magos")
    public void adcionarMago(@RequestBody Magos magos){

        monstros.add(magos);
        monstrosMagos.add(magos);
    }


    @GetMapping("/monstros/recuperarMagos/{id}")
    public Magos getMagos(@PathVariable int id){

        return monstrosMagos.get(id-1);

    }

    @DeleteMapping("/monstros/excluir/magos/{id}")
    public void excluirMagos(@PathVariable int id){
        monstrosMagos.remove(id-1);
    }

    @PostMapping("/adcionarMonstros/cavaleiros")
    public void adcionarCavaleiro(@RequestBody Cavaleiro cavaleiros){

        monstros.add(cavaleiros);
        monstrosCavaleiros.add(cavaleiros);

    }

    @GetMapping("/monstros/recuperarCavaleiros/{id}")
    public Cavaleiro getCavaleiros(@PathVariable int id){

        return monstrosCavaleiros.get(id-1);

    }

    @DeleteMapping("/monstros/excluir/cavaleiros/{id}")
    public void excluirCavaleiros(@PathVariable int id){
        monstrosCavaleiros.remove(id-1);
    }

}
