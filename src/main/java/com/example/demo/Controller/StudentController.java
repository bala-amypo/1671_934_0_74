public class StudentController {

@Autowired
StudentService studentService;

    @PostMapping("/PostStudent")
    public Student PostStd(@RequestBody Student st){
        return studentService.insertStudent(st);
    }
    @GetMapping("/getall")
    public List<Student> getAll()
    {
        return studentService.getAllStudents();
    }
    @GetMapping("/get/{id}")
    public Optional<Student> get(@PathVariable int id)
    {
        return ser.getbyid(id);
    }
    @PutMapping("/update/{id}")
    public Student update(@PathVariable int id, @RequestBody Student st)
    {
        return ser.updateTable(id,st);
        
    }
    @DeleteMapping("/delete/{id}")
    public Student Delete(@PathVariable int id){
        return ser.deleteID(id);
    }
}
