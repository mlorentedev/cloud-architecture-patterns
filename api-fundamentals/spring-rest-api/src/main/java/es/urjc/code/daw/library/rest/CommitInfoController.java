package es.urjc.code.daw.library.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commit-info")
public class CommitInfoController {
    
    private final GitProperties gitProperties;

    @Autowired
    public CommitInfoController(GitProperties gitProperties) {
        this.gitProperties = gitProperties;
    }

    @GetMapping
    public GitProperties getCommitInfo() {
        return gitProperties;
    }
    
}
