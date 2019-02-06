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

/**
 * An News object contains information related to a single news.
 */

public class NewsItem {
    /** The Title of the news */
    private String mNewsTitleMainPage;

    /** The date of the news */
    private String mNewsDateMainPage;

    /** The publisher of the news */
    private String mNewsSourceMainPage;


    /**
     * Public Constructor of the News Class.
     *
     * @param newsTitleMainPage is the title of the news
     * @param newsDateMainPage is the date when the news published
     * @param newsSourceMainPage is the publisher of the news.
     */
    public NewsItem(String newsTitleMainPage, String newsDateMainPage, String newsSourceMainPage) {
        mNewsTitleMainPage= newsTitleMainPage;
        mNewsDateMainPage = newsDateMainPage;
        mNewsSourceMainPage = newsSourceMainPage;

    }

    /**
     * Since the global variables are private, we need to create public methods
     * so that other classes cam access this information about the newsItem.
     */

    /**
     * Returns the tile of the news.
     */
    public String getNewsTitleMainPage() {
        return mNewsTitleMainPage;
    }

   /**
     * Returns the date of the news.
     */
    public String getNewsDateMainPage() {
        return mNewsDateMainPage;
    }

    /**
     * Returns the tile of the news.
     */
    public String getNewsSourceMainPage() {
        return mNewsSourceMainPage;
    }
}
