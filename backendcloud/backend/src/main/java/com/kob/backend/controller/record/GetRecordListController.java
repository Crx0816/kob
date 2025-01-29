package com.kob.backend.controller.record;

import com.kob.backend.service.record.GetRecordListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GetRecordListController {
    @Autowired
    private GetRecordListService getRecordListService;

    @GetMapping("/record/getlist/")
    public Object getRecordList(@RequestParam Map<String, String> params) {
        Integer page = Integer.parseInt(params.get("page"));
        return getRecordListService.getList(page);
    }
}
