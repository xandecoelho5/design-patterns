package br.com.xandecoelho5.abstractfactory.service.factory;

import br.com.xandecoelho5.abstractfactory.service.services.CarService;
import br.com.xandecoelho5.abstractfactory.service.services.UserService;

public interface ServicesAbstractFactory {

    CarService getCarService();

    UserService getUserService();
}
