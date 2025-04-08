package gesc.controller;


import gesc.data.AccountDataTransfer;
import gesc.data.AccountDataTransfer2;
import gesc.data.CheckingAccountDataTransfer;
import gesc.data.SavingAccountDataTransfer;
import gesc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/gesc/account")
public class AccountController {
    @Autowired
    private AccountService as ;


    @PostMapping(value = "/create")
    public String create(@RequestBody AccountDataTransfer2 a) {return this.as.create(a);}


    @GetMapping("/allCheckingAccount")
    public List<CheckingAccountDataTransfer> getAllCheckingAccount(){
        return this.as.allCheckingAccount() ;
    }
    @GetMapping("/allSavingAccount")
    public List<SavingAccountDataTransfer> getAllSavingAccount(){
        return this.as.allSavingAccount() ;
    }

    @GetMapping("/search/{numAccount}&{typeAccount}")
    public AccountDataTransfer search(@PathVariable String numAccount , @PathVariable String typeAccount){
        return this.as.searchAccount(numAccount , typeAccount);
    }

    @PutMapping("/changeStatus/{numAccount}")
    public String changeStatus(@PathVariable String numAccount){
            return this.as.changeStatus(numAccount);
    }


}
