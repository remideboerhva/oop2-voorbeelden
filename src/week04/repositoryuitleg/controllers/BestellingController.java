package week04.repositoryuitleg.controllers;

import week04.repositoryuitleg.views.BestellingView;
import week04.repositoryuitleg.views.View;

/**
 *
 */
public class BestellingController implements Controller{

    private final BestellingView view;

    public BestellingController() {
        this.view = new BestellingView();
    }

    @Override
    public View getView() {
        return view;
    }
}
