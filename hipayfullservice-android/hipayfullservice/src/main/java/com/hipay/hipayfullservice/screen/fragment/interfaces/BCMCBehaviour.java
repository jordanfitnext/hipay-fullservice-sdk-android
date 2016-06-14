package com.hipay.hipayfullservice.screen.fragment.interfaces;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.text.InputFilter;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

import com.hipay.hipayfullservice.R;

/**
 * Created by nfillion on 20/05/16.
 */
public class BCMCBehaviour implements ICardBehaviour {

    @Override
    public void updateForm(EditText cardNumber, EditText cardCVV, EditText cardExpiry, TextInputLayout securityCodeLayout, Context context) {

        cardCVV.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
        //hide the security code for bcmc
        securityCodeLayout.setVisibility(View.GONE);

        cardExpiry.setImeOptions(EditorInfo.IME_ACTION_DONE);

        cardNumber.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.icon_product_bcmc, 0);
        cardCVV.setHint(context.getString(R.string.card_security_code_placeholder_cvv));
        //bcmc
        //"6703 0000 0000 00003",
        //cardNumber.setText("67030000000000003");
        //cardCVV.setText("123");

    }

    @Override
    public boolean isSecurityCodeValid(EditText cardCVV) {
                return true;
    }

    @Override
    public boolean hasSecurityCode() {
        return false;
    }
}