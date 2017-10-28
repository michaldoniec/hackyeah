package pl.hackyeah.fraudapp;


import org.springframework.stereotype.Component;
import pl.hackyeah.fraudapp.wsdallegro.service.*;

import java.util.List;

@Component
public class AllegroFacade {

    public void doAll(){
        ServiceService serviceService = new ServiceService();
        ServicePort allegro = serviceService.getServicePort();

        Integer countryCode = 1;
        String webApiKey = "8856d759";
        Long localVersion = 1509099399L;
        DoLoginRequest doLoginRequest = new DoLoginRequest();
        doLoginRequest.setUserLogin("TomBujak");
        doLoginRequest.setUserPassword("Lolek123!@#");
        doLoginRequest.setCountryCode(countryCode);
        doLoginRequest.setLocalVersion(localVersion);
        doLoginRequest.setWebapiKey(webApiKey);

        DoLoginResponse doLoginResponse =  allegro.doLogin(doLoginRequest);
        if (doLoginResponse.getSessionHandlePart() != "") {

            // Identyfikator sesji dla użytkownika jest trzymany w: doLoginResponse.getSessionHandlePart()
            System.out.println(true);;
        } else {
            System.out.println(false);
        }
        CatInfoType catInfoType = new CatInfoType();
//        catInfoType.set
        DoGetCatsDataRequest doGetCatsDataRequest = new DoGetCatsDataRequest();
        doGetCatsDataRequest.setWebapiKey(webApiKey);
        doGetCatsDataRequest.setCountryId(countryCode);


        ///

        DoGetItemsListRequest itemsreq = new DoGetItemsListRequest();
        itemsreq.setCountryId(countryCode);
        itemsreq.setWebapiKey(webApiKey);
        Integer scope=0,size=0,offset=0;
        itemsreq.setResultOffset(offset);
        itemsreq.setResultSize(size);
        itemsreq.setResultScope(scope);

        ArrayOfFilteroptionstype filter = new ArrayOfFilteroptionstype();
        // Filter Kategorii , id można zdobyć poprzez http://allegro.pl/category_map.php?id=0&cols=3&show=cids lub funkcją
        // z webapi , ale to już sobie można znaleźć
        FilterOptionsType fotcat = new FilterOptionsType();
        fotcat.setFilterId("category");
        ArrayOfString categories = new ArrayOfString();
        categories.getItem().add("165"); // TELEFONY
        fotcat.setFilterValueId(categories);
        // Dodajemy do gamy filtrów
        filter.getItem().add(fotcat);

        itemsreq.setFilterOptions(filter);

        DoGetItemsListResponse doGetItemsList = allegro.doGetItemsList(itemsreq);
        ArrayOfItemslisttype itemsList = doGetItemsList.getItemsList();
        itemsList.getItem();

        //        System.out.println(doGetItemsList);
//        List<FiltersListType> item = doGetItemsList.getFiltersList().getItem();
//        // Ograniczyłem też iterację do 1000 jak później widać w ifie , bo nie chciałem odrazu całości przeszukiwać
//        // ale jak będziecie mieć lipe i nie znajdziecie to wywalcie to po prostu
//        int i = 0;

//        for(FiltersListType flt : item)
//        {
//            if (i < 1000)
//            {
//                System.out.println("-----------------");
//                System.out.println("Filter name : " + flt.getFilterName());
//                System.out.println("Filter id   : " + flt.getFilterId());
//                if(flt.getFilterValues() != null)
//                    for(FilterValueType fvt : flt.getFilterValues().getItem())
//                        System.out.println("Filter Value id : " + fvt.getFilterValueId() + " Filter Value name : " + fvt.getFilterValueName());
//                i++;
//            }
//        }
    }
}