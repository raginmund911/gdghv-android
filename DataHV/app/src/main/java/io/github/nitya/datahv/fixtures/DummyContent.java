package io.github.nitya.datahv.fixtures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    //=================================================================
    /* Abstract Class */
    //=================================================================
    public abstract static class DummyItem {

        public DummyItem() { }

        /* Gets called in details view */
        public abstract String getContent();

        public abstract String getId();

    }

    //=================================================================
    /* Concrete Dummy Item of type County */
    //=================================================================
    public static class DummyCounty extends DummyItem {

        /*
        Keep everything as String for simplicity - this way we can grab CSV for data and populate directly
        County      : Albany,
        County Seat : City of Albany,
        Address     : 112 State Street,
        City        : Albany,
        Zip5        : 12207,
        ContactType : County Executive's Office,
        Phone       : (518)447-7040,
        Longitude   : -73.753959,
        Latitude    : 42.650164,
        CountyWebsite: http://www.albanycounty.com/,
        Location    : "112 State Street
        Albany 12207
                (42.6501637986, -73.7539594378)"

        We'll ignore the Location attribute for now..
        */
       static String[] data = new String[]{
               "Albany,City of Albany,112 State Street,Albany,12207,County Executive's Office,(518)447-7040,-73.753959,42.650164,http://www.albanycounty.com/",
               "Allegany,Village of Belmont,7 Court St.,Belmont,14813,County Administrator's Office,(585)268-9217,-78.033207,42.224868 ,http://www.alleganyco.com/",
               "Bronx,Borough of the Bronx,851 Grand Concourse,New York,10451,Borough President's Office,(718)590-3500,-73.923762,40.826289,http://bronxboropres.nyc.gov/",
               "Broome,City of Binghamton,60 Hawley Street,Binghamton,13902,County Executive's Office,(607)778-2109,-75.910706,42.096682,http://www.gobroomecounty.com/",
               "Cattaraugus,Village of Little Valley,303 Court St.,Little Valley,14755,County Administrator's Office,(716)938-2577,-78.800525,42.252109,http://www.cattco.org/",
               "Cayuga,City of Auburn,160 Genesee St.,Auburn,13021,County Administrator's Office,(315)253-1525,-76.569546,42.929717,http://www.co.cayuga.ny.us/",
               "Chautauqua,Village of Mayville,3 North Erie Street,Mayville,14757,County Executive's Office,(716)753-7111,-79.504908,42.254671,http://www.co.chautauqua.ny.us/pages/default.aspx",
               "Chemung,City of Elmira,203 Lake St.,Elmira,14902,County Executive's Office,(607)737-2912,-76.802081,42.089989,http://www.chemungcounty.com/",
               "Chenango,City of Norwich,5 Court St.,Norwich,13815,County Clerk's Office,(607)337-1450,-75.526183,42.531930,http://www.co.chenango.ny.us/",
               "Clinton,City of Plattsburgh,137 Margaret St.,Plattsburgh,12901,County Administrator's Office,(518)565-4600,-73.453974,44.699264,http://www.clintoncountygov.com/",
               "Columbia,City of Hudson,401 State St.,Hudson,12534,County Clerk's Office,(518)828-3339,-73.787007,42.252100,http://www.columbiacountyny.com/",
               "Cortland,City of Cortland,60 Central Ave.,Cortland,13045,County Administrator's Office,(607)753-5048,-76.176622,42.600634,http://www.cortland-co.org/",
               "Delaware,Village of Delhi,111 Main St.,Delhi,13753,County Clerk's Office,(607)746-2123,-74.916077,42.277543,http://www.co.delaware.ny.us/index.htm",
               "Dutchess,City of Poughkeepsie,22 Market St., 6Th Floor,Poughkeepsie,12601,County Executive's Office,(845)486-2100,-73.929549,41.703563,http://dutchessny.gov/",
               "Erie,City of Buffalo,95 Franklin St.,Buffalo,14202,County Executive's Office,(716)858-7450,-78.876714,42.883903,http://www2.erie.gov/",
               "Essex,Hamlet of Elizabethtown,7551 Court St., P.O. Box 217,Elizabethtown,12932,County Manager's Office,(518)873-3333,-73.594344,44.214902,http://www.co.essex.ny.us/",
               "Franklin,Village of Malone,355 W. Main St.,Malone,12953,County Manager's Office,(518)481-1693,-74.295309,44.848998,http://franklincony.org/content"
       };

        public String county;
        public String countySeat;
        public String address;
        public String city;
        public String zip5;
        public String contactType;
        public String phone;
        public String longitude;
        public String latitude;
        public String countyWebsite;

        public DummyCounty(String data) {
            StringTokenizer tokenizer = new StringTokenizer(data,",");
            if (tokenizer.countTokens() < 10)
                throw new RuntimeException("Invalid Dummy Item data");

            this.county = tokenizer.nextToken();
            this.countySeat = tokenizer.nextToken();
            this.address = tokenizer.nextToken();
            this.city =tokenizer.nextToken();
            this.zip5 = tokenizer.nextToken();
            this.contactType = tokenizer.nextToken();
            this.phone = tokenizer.nextToken();
            this.longitude = tokenizer.nextToken();
            this.latitude = tokenizer.nextToken();
            this.countyWebsite =tokenizer.nextToken();
        }

        /* Gets called in details view */
        @Override
        public String getContent(){
            return this.county+"\n"+this.address+"\n"+this.city+"\nNY "+this.zip5;
        }

        @Override
        public String getId(){
            return this.county;
        }

        /* Gets called in list view */
        @Override
        public String toString() {
            return this.county+" (NY "+this.zip5+")";
        }
    }


    //=================================================================
    /* Concrete Dummy Item of type Business */
    //=================================================================
    public static class DummyBusiness extends DummyItem {
        /*
        Keep everything as String for simplicity - this way we can grab CSV for data and populate directly
            DOS ID                  : 4734897
            Current Entity Name     : RIVERFRONT DOULA LLC
            Initial DOS Filing Date : 03/31/2015
            County                  : DUTCHESS
            Jurisdiction            : NEW YORK
            Entity Type             : DOMESTIC LIMITED LIABILITY COMPANY
            DOS Process Name        : JENNIFER BREDIN
            DOS Process Address 1   : 39 WILLOW ROAD
            DOS Process Address 2   :
            DOS Process City        : BEACON
            DOS Process State       : NEW YORK
            DOS Process Zip         : 12508

            // For now we'll ignore everything below this
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

        static String[] data = new String[]{
                "4734897,RIVERFRONT DOULA LLC,03/31/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,JENNIFER BREDIN,39 WILLOW ROAD,,BEACON,NEW YORK,12508",
                "4735038,ARC-38, INC.,03/31/2015,DUTCHESS,NEW YORK,DOMESTIC NOT-FOR-PROFIT CORPORATION,ARC-38, INC.,426 OLD ROUTE 22,,AMENIA,NEW YORK,12501",
                "4734402,RICHARD KAISER, LLC,03/31/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,C/O UNITED STATES CORPORATION AGENTS, INC.,7014 13TH AVENUE, SUITE 202,,BROOKLYN,NEW YORK,11228",
                "4734574,PUDDLE BEAR CLOTHING, LTD.,03/31/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,PUDDLE BEAR CLOTHING, LTD.,5 CLIFF STREET,,BEACON,NEW YORK,12508",
                "4735048,MLC REALTY GROUP INC.,03/31/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,MLC REALTY GROUP INC.,8 SHELDRON DR.,,POUGHKEEPSIE,NEW YORK,12603",
                "4734337,KHS EQUITY COMPANY, LLC,03/31/2015,DUTCHESS,DELAWARE,FOREIGN LIMITED LIABILITY COMPANY,KHS EQUITY COMPANY, LLC,199 WEST ROAD, SUITE 101,,PLEASANT VALLEY,NEW YORK,12569",
                "4734302,THE GARDEN EXPERIENCE INC,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,JACOBO MENDEZ PEREZ,22 INNIS AVE,APT 2,POUGHKEEPSIE,NEW YORK,12601",
                "4733642,28 MT RUTSEN RD, LLC,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,THE LIMITED LIABILITY COMPANY,P.O. BOX 3536,,KINGSTON,NEW YORK,12402",
                "4733839,KELLY GROUP COACHING, INC.,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,C/O CHRISTOPHER A. MONTALTO, ESQ.,25 MARKET STREET,SUITE 700,POUGHKEEPSIE,NEW YORK,12601",
                "4733569,EKJ FARM LLC,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,C/O MELVIN GERSHON 2009 FAMILY TRUST,W. 207 25TH STREET,,NEW YORK,NEW YORK,10001",
                "4734298,THE AVOCADO CAFE INC.,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,THE AVOCADO CAFE INC.,P.O. BOX 909,,MILLERTON,NEW YORK,12546",
                "4733793,ROCHESTER PROPS. LLC,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,MICHELE PASQUALE,435 REGENCY DRIVE,,FISHKILL,NEW YORK,12524",
                "4733831,OPTIMAL TECHNICAL SOLUTIONS, LLC,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,OPTIMAL TECHNICAL SOLUTIONS, LLC,73 DOGWOOD ROAD,,HOPEWELL JUNCTION,NEW YORK,12533",
                "4733595,BEACON MAIN STREET THEATER LLC,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,BEACON MAIN STREET THEATER LLC,484 MAIN STREET,,BEACON,NEW YORK,12508",
                "4733887,NATURAL ENERGY SOLUTIONS, LLC,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,NATURAL ENERGY SOLUTIONS, LLC,406 FITZSIMMONS RD.,,RED HOOK,NEW YORK,12571",
                "4734202,VANDEMARK, INC.,03/30/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,VANDEMARK, INC.,4 FOWLER STREET,,BEACON,NEW YORK,12508",
                "4732943,KHS CONSTRUCTION, LLC,03/27/2015,DUTCHESS,DELAWARE,FOREIGN LIMITED LIABILITY COMPANY,KHS CONSTRUCTION, LLC,199 WEST ROAD,SUITE 101,PLEASANT VALLEY,NEW YORK,12569",
                "4733243,WIOT SOLUTIONS, INC.,03/27/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,WIOT SOLUTIONS, INC.,3 STONE STREET,,NEW HAMBURG,NEW YORK,12590",
                "4732860,PETERBOROUGH CORPORATION,03/27/2015,DUTCHESS,DELAWARE,FOREIGN BUSINESS CORPORATION,PETERBOROUGH CORPORATION,P.O. BOX 222,,LAGRANGEVILLE,NEW YORK,12540-0222",
                "4733038,E2 CONTRACTING, INC.,03/27/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,E2 CONTRACTING, INC.,P.O. BOX 824,,PLEASANT VALLEY,NEW YORK,12569-0824",
                "4732888,CORT ENTERPRISES, LLC,03/27/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,ELISABETH CORT,64 CARRIAGE DRIVE,,RED HOOK,NEW YORK,12571",
                "4733421,BULLDOGS & BURRITOS LTD.,03/27/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,BULLDOGS & BURRITOS LTD.,796 MAIN STREET,,POUGHKEEPSIE,NEW YORK,12603",
                "4732866,MAIN STREET HOSPITALITY CORP.,03/27/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,C/O LEVINE & LEVINE, P.C.,2 JEFFERSON PLAZA,,POUGHKEEPSIE,NEW YORK,12601",
                "4733301,REDLINE MINISTRIES, INC,03/27/2015,DUTCHESS,NEW YORK,DOMESTIC NOT-FOR-PROFIT CORPORATION,REDLINE MINISTRIES, INC,16 DONNY DRIVE,,WAPPINGERS FALLS,NEW YORK,12590",
                "4732516,SPRINGHILL FARM, HUDSON VALLEY LLC,03/26/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,SPRINGHILL FARM, HUDSON VALLEY LLC,379 SLATE QUARRY ROAD,,RHINEBECK,NEW YORK,12572",
                "4732417,GIFFORD ROAD GENERAL PARTNERS LLC,03/26/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,GIFFORD ROAD GENERAL PARTNERS LLC,3 GIFFORD ROAD,,MILLBROOK,NEW YORK,12545",
                "4732764,CHARLOTTE TAYLOR, LLC,03/26/2015,DUTCHESS,CONNECTICUT,FOREIGN LIMITED LIABILITY COMPANY,CHARLOTTE TAYLOR, LLC,15 RHYNUS ROAD,,SHARON,CONNECTICUT,06069",
                "4732035,DMS HOST LLC,03/26/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,DMS HOST LLC,3 GIFFORD ROAD,,MILLBROOK,NEW YORK,12545",
                "4732531,MIND MAGIC PRODUCTIONS, LLC,03/26/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,MIND MAGIC PRODUCTIONS, LLC,54 WALSH ROAD,,LAGRANGEVILLE,NEW YORK,12540",
                "4732311,GLL TRANSPORTATION INC,03/26/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,GLL TRANSPORTATION INC,16 ARNOLD BLVD,,POUGHKEEPSIE,NEW YORK,12603",
                "4732584,AN AMERICAN EDITOR LTD,03/26/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,LAW OFFICE OF BENJAMIN GREENWALD,121 EXECUTIVE DRIVE, STE 200,,NEW WINDSOR,NEW YORK,12553",
                "4732630,UMBRELLA DESIGN GROUP, INC.,03/26/2015,DUTCHESS,NEW YORK,DOMESTIC BUSINESS CORPORATION,RANDALL MARTIN,25 MASTERS PLACE,,BEACON,NEW YORK,12508",
                "4732238,JJR MAIN, LLC,03/26/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,THE LIMITED LIABILITY COMPANY,585 MAIN STREET,,POUGHKEEPSIE,NEW YORK,12603",
                "4732820,T&L WORLDWIDE LLC,03/26/2015,DUTCHESS,NEW YORK,DOMESTIC LIMITED LIABILITY COMPANY,MIKE COLUCCI & JON TUTTLE,1056 BEEKMAN ROAD,,HOPEWELL JUNCTION,NEW YORK,12533"
        };

        public String dosID;
        public String name;
        public String filingDate;
        public String county;
        public String jurisdiction;
        public String dosName;
        public String dosAddress1;
        public String dosAddress2;
        public String dosCity;
        public String dosState;
        public String dosZip;

        public DummyBusiness(String data) {
            StringTokenizer tokenizer = new StringTokenizer(data,",");
            if (tokenizer.countTokens() < 11)
                throw new RuntimeException("Invalid Dummy Business data");

            this.dosID = tokenizer.nextToken();
            this.name = tokenizer.nextToken();
            this.filingDate = tokenizer.nextToken();
            this.county = tokenizer.nextToken();
            this.jurisdiction = tokenizer.nextToken();
            this.dosName = tokenizer.nextToken();
            this.dosAddress1 = tokenizer.nextToken();
            this.dosAddress2 = tokenizer.nextToken();
            this.dosCity = tokenizer.nextToken();
            this.dosState = tokenizer.nextToken();
            this.dosZip = tokenizer.nextToken();
        }

        /* Gets called in details view */
        @Override
        public String getContent(){
            return "Name: "+this.name+
                    "\nFiled:"+this.filingDate+
                    "\nJurisdiction:"+this.jurisdiction+
                    "\n\nID: "+this.dosID+
                    "\nName:"+this.dosName+
                    "\nAddress:"+this.dosAddress1+
                    "\nCity:"+this.dosCity+
                    "\nState:"+this.dosState+
                    "\nZip:"+this.dosZip;
        }

        @Override
        public String getId(){
            return this.dosID;
        }

        /* Gets called in list view */
        @Override
        public String toString() {
            return this.name;
        }
    }



    //=================================================================
    /* DummyContent
    //=================================================================

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    /* Fixtures */
    static {
        // Pick what data you want to show

        /*
        for (int i=0; i<DummyCounty.data.length; i++){
            addItem(new DummyCounty(DummyCounty.data[i]));
        }
        */

        for (int i=0; i<DummyBusiness.data.length; i++){
            addItem(new DummyBusiness(DummyBusiness.data[i]));
        }

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

}






/*

    Socrata Filtering: http://dev.socrata.com/docs/filtering.html
    Socrata Queries: http://dev.socrata.com/docs/queries.html


    =======================================================
    All items below are 2000/page (except businesses)
    Data item from: https://data.ny.gov/resource/4xc7-bukh.json?$limit=2000&$offset=0
    Counties in NY (126)
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
            "state":"",
            "zip":"12207"}"
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



    =======================================================
    Data item from: https://data.ny.gov/resource/hnuz-89gw.json?$limit=2000&$offset=0
    Counties with Websites (57)
    {
        website: {
            url: "http://www.albanycounty.com"
        },
        county: "Albany",
        swis_code: "10000",
        type: "County",
        gnis_id: "974099",
        type_code: "1"
    },


    =======================================================
    Data item from: https://data.ny.gov/resource/y6cw-5z7p.json?$limit=2000&$offset=0
    Towns, Cities and Villages by County (302)
    {
        county: "Albany",
        count_municipality: "10",
        type: "Town",
        type_code: "3"
    },


    =======================================================
    Data item: https://data.ny.gov/resource/55k6-h6qq.json?$limit=2000&$offset=0
    --> NYS Locality Hierarchy with Websites (1605)
    {
        city_name: "Albany",
        website: {
            url: "http://www.albanyny.org"
        },
        county: "Albany",
        municipality: "Albany",
        swis_code: "10100",
        type: "City",
        gnis_id: "978659",
        type_code: "2"
    },


    =======================================================
    Data item: https://data.ny.gov/resource/hnrk-kcnd.json?$limit=5000&$offset=0
    --> NYS State Towns Hierarchy with Websites (932)
    {
        town_name: "Berne",
        website: {
            url: "http://berneny.org"
        },
        county: "Albany",
        swis_code: "12000",
        type: "Town",
        gnis_id: "978728",
        type_code: "3"
    },

    =======================================================
    Data item: https://data.ny.gov/resource/vcy8-dghb.json?$limit=5000&$offset=0
    --> NYS Cities Hierarchy with Websites (62)
    {
    city_name: "Albany",
    website: {
    url: "http://www.albanyny.org"
    },
    county: "Albany",
    municipality: "Albany",
    swis_code: "10100",
    type: "City",
    gnis_id: "978659",
    type_code: "2"
    },

    =======================================================
    Data item: https://data.ny.gov/resource/vcy8-dghb.json?$limit=5000&$offset=0
    --> NYS Villages Hierarchy with Websites (62)

    =======================================================
    Data item from: https://data.ny.gov/resource/n9v6-gdp6.json?$order=dos_id ASC&$limit=2000&$offset=0
    https://data.ny.gov/resource/n9v6-gdp6.json?$order=dos_id ASC&$limit=10000&$offset=0
    --> Businesses

    Ordered in reverse chronological order of existence data
    https://data.ny.gov/resource/n9v6-gdp6.json?$limit=1000&$offset=0&$order=initial_dos_filing_date%20DESC
    Change offset and limit to grab more records

    Limited to Dutchess county
    https://data.ny.gov/resource/n9v6-gdp6.json?$limit=50000&$offset=0&$order=initial_dos_filing_date%20DESC&county=Dutchess
    {
      "registered_agent_address_1" : "23 NETHERWOOD HILL",
      "registered_agent_state" : "NEW YORK",
      "dos_process_zip" : "12578",
      "dos_process_state" : "NEW YORK",
      "registered_agent_zip" : "12578",
      "jurisdiction" : "NEW YORK",
      "dos_process_city" : "SALT POINT",
      "dos_process_name" : "DUTCHESS TUTORING LLC",
      "registered_agent_city" : "SALT POINT",
      "current_entity_name" : "DUTCHESS TUTORING LLC",
      "dos_process_address_1" : "23 NETHERWOOD HILL",
      "dos_id" : "4443192",
      "initial_dos_filing_date" : "2013-08-09T00:00:00",
      "county" : "DUTCHESS",
      "registered_agent_name" : "KRISTEN R. RICHARD",
      "entity_type" : "DOMESTIC LIMITED LIABILITY COMPANY"
    }

    =======================================================
 */