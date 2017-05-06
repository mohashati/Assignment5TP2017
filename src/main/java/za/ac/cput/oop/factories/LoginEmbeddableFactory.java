package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.LoginEmbeddable;

/**
 * Created by tmoshasha on 04/27/2017
 */
public interface LoginEmbeddableFactory {

    LoginEmbeddable createLogin(String username, String password);

}
