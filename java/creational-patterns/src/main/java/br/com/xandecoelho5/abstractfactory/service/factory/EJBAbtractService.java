package br.com.xandecoelho5.abstractfactory.service.factory;

import br.com.xandecoelho5.abstractfactory.service.services.CarEJBService;
import br.com.xandecoelho5.abstractfactory.service.services.CarService;
import br.com.xandecoelho5.abstractfactory.service.services.UserEJBService;
import br.com.xandecoelho5.abstractfactory.service.services.UserService;

public class EJBAbtractService implements ServicesAbstractFactory{

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }
}
