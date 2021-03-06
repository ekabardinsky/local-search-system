package ru.ekabardinsky.iit.local.search.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ekabardinsky.iit.local.search.system.searchEngine.Indexer;
import ru.ekabardinsky.iit.local.search.system.template.IndexerTemplate;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * Created by ekabardinsky on 2/20/17.
 */

@RestController
public class IndexerController {

    @Autowired
    private Indexer indexer;

    @RequestMapping(method = POST, value = "/api/index")
    public IndexerTemplate parser(@RequestBody IndexerTemplate body) {
        return indexer.index(body);
    }
}
