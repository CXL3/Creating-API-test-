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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Create a place holder list
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Gone with the Wind");
        testList.add("Treasure Island");
        testList.add("The picture of Dorian Gray");
        testList.add(" To kill a Mockingbird");
        testList.add("Pride and Prejudice");
        testList.add("Emma");
        testList.add("Odyssey");
        testList.add("The grapes of wrath");
        testList.add("Jane Eyre");

        // Add reference to Listview in the Layout
        ListView testListView = (ListView) findViewById(R.id.textID1);

        //Create a new arrayAdapter of testList
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,testList);

        //Set the adapter on The list View, sp tje list can be populated in the user interface
        testListView.setAdapter(adapter);
    }

}
