package gesc.service;


import gesc.data.ClientDataTransfer;
import gesc.entities.CLIENT;
import gesc.mail.ServiceMail;
import gesc.repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ClientService {
    @Autowired
    private  clientRepository cr;
    private final ServiceMail sm  = new ServiceMail() ;



    public  String create(CLIENT c){
        var client = this.cr.save(c);
        /*this.sm.sendSimpleMail(c.getEmail() ,
                "ronallogo45@gmail.com" , "INSCRIPTION DANS LE SYSTEME DE GESC" ,
                "Mr/Mme  "+c.getName() + " "+c.getSurname() + "  vous etes désormais client(e) de GESC .");*/
        return client.toString();
    }



    public List<ClientDataTransfer> getAll(){
        return this.cr.findAll().stream().map(x->
                 new ClientDataTransfer(x.getIdClient() ,
                         x.getName() , x.getSurname() , x.getEmail() , x.getPhone())
                ).collect(Collectors.toList()) ;
    }



}
