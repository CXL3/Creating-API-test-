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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Create a place holder list
        ArrayList<NewsItem> newsList = new ArrayList<>();
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));
        newsList.add(new NewsItem("KirklandNewsOne","Feb2. 2019","Seattle Times"));

        // Add reference to Listview in the Layout
        ListView newsListView = (ListView) findViewById(R.id.list);

        //Create a new arrayAdapter of testList
        NewsAdapter adapter = new NewsAdapter(this, newsList);

        //Set the adapter on The list View, sp tje list can be populated in the user interface
        newsListView.setAdapter(adapter);
    }

}
