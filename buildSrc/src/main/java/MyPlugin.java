import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("ddddd");
        MyExtension myext = project.getExtensions().create("myext", MyExtension.class);
        project.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                System.out.println(myext.getName());
                System.out.println(myext.getAge());
            }
        });
    }
}
