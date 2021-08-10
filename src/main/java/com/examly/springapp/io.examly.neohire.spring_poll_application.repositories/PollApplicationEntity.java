
@Data
@Entity
public class PollApplicationEntity{
@Id
@GeneratdeVale
@Column(name = "POLL_ID")
private Long pollId;
@Column(name = "QUESTION")
private String question;

}