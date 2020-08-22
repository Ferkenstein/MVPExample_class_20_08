package com.crisspian.mvpexample_class_20_08.presenter;

import com.crisspian.mvpexample_class_20_08.model.Verifier;

public class VerifierPresenter implements IPresenter {

    private Verifier verifier;
    private IViewPresenter view;

    public VerifierPresenter(IViewPresenter view) {
        this.view = view;
        verifier = new Verifier();
    }

    @Override
    public void evaluatePass(String password) {
        int res = verifier.evaluatePass(password);
        switch (res) {
            case Verifier.WEAK:
                this.view.showWeak();
            break;
            case  Verifier.MEDIUM:
                this.view.showMedium();
            break;
            case Verifier.STRONG:
                this.view.showStrong();
            break;
        }
    }


}
