package prototype.command;

import core.Command;
import org.immutables.value.Value.Immutable;

@Immutable
public abstract class EditDescription implements Command<Long> {

    public abstract String description();

    public abstract long todoId();

}
