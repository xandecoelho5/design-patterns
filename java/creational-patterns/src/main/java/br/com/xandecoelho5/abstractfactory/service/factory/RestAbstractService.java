package br.com.xandecoelho5.abstractfactory.service.factory;

import br.com.xandecoelho5.abstractfactory.service.services.CarRestApiService;
import br.com.xandecoelho5.abstractfactory.service.services.CarService;
import br.com.xandecoelho5.abstractfactory.service.services.UserRestApiService;
import br.com.xandecoelho5.abstractfactory.service.services.UserService;

public class RestAbstractService implements ServicesAbstractFactory {

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }
}
