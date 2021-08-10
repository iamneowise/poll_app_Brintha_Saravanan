package com/examly/springapp/io.examly.neohire.spring_poll_application.Controller;
import org.springframework.RestController;

@RestController
@RequestMapping(/pollApp)
public class pollApplicationController{

    @Autowired
    private PollApplicationDomain domainProcess;

@GetMapping
public ResponseEnity<List<PollApplicationRequestResponse>> getPolls(){
List<PollApplicationRequestResponse> response = domainProcess.getPolls();
return new ResponseEntity(response, HttpStatus.ok);
}

@PostMapping
public ResponseEnity<PollApplicationRequestResponse> createPolls(
    @Request PollApplicationRequestResponse request
){
PollApplicationRequestResponse response = domainProcess.createPolls(request);
return new ResponseEntity(response, HttpStatus.Created);
}

@PutMapping("/{id}")
public ResponseEnity<PollApplicationRequestResponse> updatePolls(
    @Request PollApplicationRequestResponse request,
     @PathVariable Long id
){
PollApplicationRequestResponse response = domainProcess.updatePolls(request);
return new ResponseEntity(response, HttpStatus.Created);
}

@GetMapping("/{id}")
public ResponseEnity<PollApplicationRequestResponse> findPollById(
    @PathVariable Long id
){
PollApplicationRequestResponse response = domainProcess.findPollById(id);
return new ResponseEntity(response, HttpStatus.OK);
}

@DeleteMapping("/{id}")
public ResponseEnity<PollApplicationRequestResponse> deletePolls(
    @PathVariable Long id
){
PollApplicationRequestResponse response = domainProcess.deletePolls(id);
return new ResponseEntity(response, HttpStatus.ok);
}

}