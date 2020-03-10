package week04.repositoryuitleg.controllers;

import week04.repositoryuitleg.views.ProductView;
import week04.repositoryuitleg.views.View;

public class ProductController implements Controller{

    private final ProductView rootView;

    public ProductController() {
        this.rootView = new ProductView();
    }

    @Override
    public View getView() {
        return this.rootView;
    }
}
