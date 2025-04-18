package com.works.restcontrollers;

import com.works.models.DummyComments;
import com.works.services.DummyService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy")
@RequiredArgsConstructor
@Tag(name = "Dummy Rest Controller", description = "Dummy Manager")
public class DummyRestController {

    private final DummyService dummyService;

    @GetMapping("comments")
    public DummyComments comment() {
        return dummyService.comments();
    }

}
