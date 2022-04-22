package controller;

import model.Nodes;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NearbyController {

    public Nodes getNearByNodes(){return new Nodes();}
}
