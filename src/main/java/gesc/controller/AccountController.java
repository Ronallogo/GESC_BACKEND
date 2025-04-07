package gesc.controller;


import gesc.data.AccountDataTransfer2;
import gesc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/gesc/account")
public class AccountController {
    @Autowired
    private AccountService as ;


    @PostMapping(value = "/create")
    public String create(@RequestBody AccountDataTransfer2 a) {return this.as.create(a);}
}
