package com.works.restcontrollers;

import com.works.models.Comment;
import com.works.models.DummyComments;
import com.works.models.UserToken;
import com.works.services.DummyService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("comment/{id}")
    public Comment comment(@PathVariable Integer id) {
        return dummyService.comment(id);
    }

    @GetMapping("login")
    public ResponseEntity login(@RequestParam String username, @RequestParam String password) {
        return dummyService.userLogin(username, password);
    }

}
