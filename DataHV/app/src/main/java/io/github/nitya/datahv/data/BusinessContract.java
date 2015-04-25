package io.github.nitya.datahv.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by nitya on 4/24/15.
 */
public class BusinessContract {

    // The "Content authority" is a name for the entire content provider. It should reflect
    // the value declared in AndroidManifest.
    public static final String CONTENT_AUTHORITY = "io.github.nitya.datahv.app";

    // Define the base of all URI's that will resolve to this content provider (authority)
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    // Define Possible paths (appended to base content URI for possible URI's)
    public static final String PATH_COUNTY  = "county";
    public static final String PATH_BUSINESS = "business";



    //================================
    // County Data Model
    //================================
    /*
    Keep everything as String for simplicity - this way we can grab CSV for data and populate directly
    County      : Albany,
    County Seat : City of Albany,
    Address     : 112 State Street,
    City        : Albany,
    Zip5        : 12207,
    ContactType : BusinessContract Executive's Office,
    Phone       : (518)447-7040,
    Longitude   : -73.753959,
    Latitude    : 42.650164,
    CountyWebsite: http://www.albanycounty.com/,
    Location    : "112 State Street
    Albany 12207
            (42.6501637986, -73.7539594378)"
    */
    /*
    {
        zip5: "12207",
        phone: "(518)447-7040",
        location: {
            needs_recoding: false,
            longitude: "-73.7539594378",
            latitude: "42.6501637986",
            human_address: "{
                "address":"112 State Street",
                "city":"Albany",
                "state":"","zip":"12207"
            }"
        },
        address: "112 State Street",
        county: "Albany",
        county_website: {
            url: "http://www.albanycounty.com/"
        },
        longitude: "-73.7539594378",
        latitude: "42.6501637986",
        contact_type: "County Executive's Office",
        county_seat: "City of Albany",
        city: "Albany"
     },
     */
    public static final class County implements BaseColumns {

        // Table Name
        public static final String TABLE_NAME = "County";

        // Column Names (BaseColumns ensures _id is a default column)
        public static final String COLUMN_COUNTY        = "County";
        public static final String COLUMN_COUNTY_SEAT   = "County Seat";
        public static final String COLUMN_ADDRESS       = "Address";
        public static final String COLUMN_CITY          = "City";
        public static final String COLUMN_ZIP5          = "Zip5";
        public static final String COLUMN_CONTACT_TYPE  = "Contact Type";
        public static final String COLUMN_PHONE         = "Phone";
        public static final String COLUMN_LONGITUDE     = "Longitude";
        public static final String COLUMN_LATITUDE      = "Latitude";
        public static final String COLUMN_COUNTY_WEBSITE= "County Website";
        public static final String COLUMN_LOCATION      = "Location";

        // For database projection so order is consistent
        public static final String[] FIELDS = {
                COLUMN_COUNTY, COLUMN_COUNTY_SEAT, COLUMN_ADDRESS, COLUMN_CITY, COLUMN_ZIP5,
                COLUMN_CONTACT_TYPE, COLUMN_PHONE, COLUMN_LONGITUDE, COLUMN_LATITUDE,
                COLUMN_COUNTY_WEBSITE, COLUMN_LOCATION
        };

        // URI for County data (directory and item types)
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_COUNTY).build();
        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_COUNTY;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_COUNTY;

        // Create table command
        public static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME +
                        "("
                        + COLUMN_COUNTY         + " TEXT NOT NULL PRIMARY KEY UNIQUE,"
                        + COLUMN_COUNTY_SEAT    + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_ADDRESS        + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_CITY           + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_ZIP5           + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_CONTACT_TYPE   + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_PHONE          + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_LONGITUDE      + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_LATITUDE       + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_COUNTY_WEBSITE + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_LOCATION       + " TEXT NOT NULL DEFAULT '',"
                        + ")";

    }



    //================================
    // Business Data Model
    //================================
    /*
    Keep everything as String for simplicity - this way we can grab CSV for data and populate directly
        DOS ID                  : 4734897
        Current Entity Name     : RIVERFRONT DOULA LLC
        Initial DOS Filing Date : 03/31/2015
        BusinessContract                  : DUTCHESS
        Jurisdiction            : NEW YORK
        Entity Type             : DOMESTIC LIMITED LIABILITY COMPANY
        DOS Process Name        : JENNIFER BREDIN
        DOS Process Address 1   : 39 WILLOW ROAD
        DOS Process Address 2   :
        DOS Process City        : BEACON
        DOS Process State       : NEW YORK
        DOS Process Zip         : 12508

        // For now we'll ignore everything below this -- leave this for DB VERSION 2
        CEO Name                :
        CEO Address 1           :
        CEO Address 2           :
        CEO City                :
        CEO State               :
        CEO Zip                 :
        Registered Agent Name   :
        Registered Agent Address 1  :
        Registered Agent Address 2  :
        Registered Agent City   :
        Registered Agent State  :
        Registered Agent Zip    :
        Location Name           :
        Location Address 1      :
        Location Address 2      :
        Location City           :
        Location State          :
        Location Zip
    */
    /*
        {
            dos_process_zip: "11212",
            dos_process_state: "NEW YORK",
            jurisdiction: "NEW YORK",
            dos_process_city: "BROOKLYN",
            dos_process_name: "0000 AUTO RESCUE TRANSPORT CORP.",
            current_entity_name: "0000 AUTO RESCUE TRANSPORT CORP.",
            dos_process_address_1: "382 RAMSEN AVE",
            dos_id: "4264790",
            initial_dos_filing_date: "2012-06-28T00:00:00",
            county: "KINGS",
            entity_type: "DOMESTIC BUSINESS CORPORATION"
        }
     */
    public static final class Business implements BaseColumns {

        // Table Name
        public static final String TABLE_NAME = "Business";

        // Column Names (BaseColumns ensures _id is a default column)
        public static final String COLUMN_DOS_ID            = "DOS ID";
        public static final String COLUMN_CURRENT_ENTITY_NAME = "Current Entity Name";
        public static final String COLUMN_DOS_FILING_DATE   = "Initial DOS Filing Date";
        public static final String COLUMN_COUNTY            = "County";
        public static final String COLUMN_JURISDICTION      = "Jurisdiction";
        public static final String COLUMN_ENTITY_TYPE       = "Entity Type";
        public static final String COLUMN_DOS_PROCESS_NAME  = "DOS Process Name";
        public static final String COLUMN_PROCESS_ADDRESS   = "DOS Process Address";
        public static final String COLUMN_PROCESS_CITY      = "DOS Process City";
        public static final String COLUMN_PROCESS_STATE     = "DOS Process State";
        public static final String COLUMN_PROCESS_ZIP       = "DOS Process Zip";

        // For database projection so order is consistent
        public static final String[] FIELDS = {
                COLUMN_DOS_ID, COLUMN_CURRENT_ENTITY_NAME, COLUMN_DOS_FILING_DATE, COLUMN_COUNTY,
                COLUMN_JURISDICTION, COLUMN_ENTITY_TYPE, COLUMN_DOS_PROCESS_NAME, COLUMN_PROCESS_ADDRESS,
                COLUMN_PROCESS_CITY, COLUMN_PROCESS_STATE, COLUMN_PROCESS_ZIP
        };

        // URI for County data (directory and item types)
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_BUSINESS).build();
        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BUSINESS;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BUSINESS;

        // Create table command
        public static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME +
                        "("
                        + COLUMN_DOS_ID                 + " TEXT NOT NULL PRIMARY KEY UNIQUE,"
                        + COLUMN_CURRENT_ENTITY_NAME    + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_DOS_FILING_DATE        + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_COUNTY                 + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_JURISDICTION           + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_ENTITY_TYPE            + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_DOS_PROCESS_NAME       + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_PROCESS_ADDRESS        + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_PROCESS_CITY           + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_PROCESS_STATE          + " TEXT NOT NULL DEFAULT '',"
                        + COLUMN_PROCESS_ZIP            + " TEXT NOT NULL DEFAULT '',"
                        + ")";

    }



}