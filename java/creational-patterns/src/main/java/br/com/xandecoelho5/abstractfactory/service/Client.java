package br.com.xandecoelho5.abstractfactory.service;

import br.com.xandecoelho5.abstractfactory.service.factory.EJBAbtractService;
import br.com.xandecoelho5.abstractfactory.service.factory.RestAbstractService;
import br.com.xandecoelho5.abstractfactory.service.factory.ServicesAbstractFactory;
import br.com.xandecoelho5.abstractfactory.service.services.CarService;
import br.com.xandecoelho5.abstractfactory.service.services.UserService;

public class Client {

    public static void main(String[] args) {
        ServicesAbstractFactory factory = new EJBAbtractService();
        CarService carService;
        UserService userService;

        carService = factory.getCarService();
        carService.save("ford");
        carService.update("toyota");

        userService = factory.getUserService();
        userService.save("lux");
        userService.delete(1);

        System.out.println();
        factory = new RestAbstractService();

        carService = factory.getCarService();
        carService.save("ford");
        carService.update("toyota");

        userService = factory.getUserService();
        userService.save("lux");
        userService.delete(1);
    }
}
