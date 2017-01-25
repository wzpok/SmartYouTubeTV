package com.liskovsoft.browser.other;

import android.app.Activity;
import com.liskovsoft.browser.Controller;
import com.liskovsoft.browser.R;
import com.liskovsoft.browser.UI;

public class SimpleUIController extends Controller {
    public SimpleUIController(Activity browser) {
        super(browser);
        // we must set theme before ui instantiation
        browser.setTheme(R.style.SimpleUITheme);
        initUi();
    }

    private void initUi() {
        UI ui = new SimpleUi(mActivity, this);
        setUi(ui);
    }


}