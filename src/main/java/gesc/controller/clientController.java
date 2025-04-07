package gesc.controller;

import gesc.data.ClientDataTransfer;
import gesc.entities.CLIENT;
import gesc.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/gesc/client")
@CrossOrigin("*")
public class clientController {
    @Autowired
    private clientService cs  ;
    @PostMapping(value = "/create")
    public String create(@RequestBody CLIENT c){
        return  cs.create(c) ;
    }


    @GetMapping("/all")
    public List<ClientDataTransfer> getAll(){
        return  this.cs.getAll() ;
    }
}
