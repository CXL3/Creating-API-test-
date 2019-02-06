/*
 * Copyright 2019.  Xi Lu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.clairehelp.apitest;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news
 * in the data source (a list of {@link NewsItem} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */


public class NewsAdapter extends ArrayAdapter<NewsItem> {


    /**
     * Constructs a new {@link NewsAdapter} extended from ArrayAdapter
     *
     * @param context of the app
     * @param newsList is the list of news, which is the data source of the adapter
     */

    public NewsAdapter(Context context, List<NewsItem> newsList) {
        super(context,0,newsList);
    }

    /**
     * Override getView method, so we can control how the list item views get created.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_main_list_item, parent, false);
        }

        //Use the posion parameter passed in to get a reference to the right news object from the newsList
        NewsItem currentNews = getItem(position);


        //binding the data from the news Object to the views in earthquake_list_item.xml layout

        // Find the TextView with View ID news_title
        TextView newsTitleView = (TextView) listItemView.findViewById(R.id.news_title);
        // Display the title of the CurrentNews in that TextView
        newsTitleView.setText(currentNews.getNewsTitleMainPage());


        // Find the TextView with View ID news_date
        TextView newsDateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date of the CurrentNews in that TextView
        newsDateView.setText(currentNews.getNewsDateMainPage());


        // Find the TextView with View ID news_source
        TextView newsSourceView = (TextView) listItemView.findViewById(R.id.news_source);
        // Display the publisher of the CurrentNews in that TextView
        newsSourceView.setText(currentNews.getNewsSourceMainPage());

        return listItemView;
    }

}
