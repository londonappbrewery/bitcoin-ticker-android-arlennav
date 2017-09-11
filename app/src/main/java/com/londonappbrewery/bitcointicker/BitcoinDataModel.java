package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by arlen on 9/11/2017.
 */

public class BitcoinDataModel {

    // TODO: Declare the member variables here
    private String mAsk;

    // TODO: Create a WeatherDataModel from a JSON:
    public static BitcoinDataModel fromJson(JSONObject jsonObject) {
        try {
            BitcoinDataModel bitcoinDataModel = new BitcoinDataModel();
            bitcoinDataModel.mAsk = jsonObject.getString("ask");
            return bitcoinDataModel;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getmAsk() {
        return mAsk;
    }
}
