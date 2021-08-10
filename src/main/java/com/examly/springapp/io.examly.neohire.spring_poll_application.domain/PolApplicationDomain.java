
@Service
Public class PollApplicationDomain{
@Autowired
private PollApplicationRepository repository;
public PollApplicationRequestResponse createPolls(PollApplicationRequestResponse request){
PollApplicationRequestResponse response = repository.save(request)
return response.get();

}
public PollApplicationRequestResponse UpdatePolls(PollApplicationRequestResponse request){
PollApplicationRequestResponse response = repository.save(request)
return response.get();

}
public PollApplicationRequestResponse deletePolls( Long id){
PollApplicationRequestResponse response = repository.deletById(id);
return response.get();

}
public List<PollApplicationRequestResponse> getPolls(){
List<PollApplicationRequestResponse> response = repository.findAll()
return response.get();

}
public PollApplicationRequestResponse findPollById( Long id){
PollApplicationRequestResponse response = repository.findById(id)
return response.get();

}


}