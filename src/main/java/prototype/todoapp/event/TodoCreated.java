package prototype.todoapp.event;

import org.immutables.gson.Gson.TypeAdapters;
import org.immutables.mongo.Mongo.Id;
import org.immutables.value.Value.Immutable;

import com.google.common.base.Optional;

import core.EventId;
import prototype.todoapp.TodoId;

@Immutable
@TypeAdapters
public abstract class TodoCreated implements TodoEvent {

    public abstract String description();

    @Id
    @Override
    public abstract EventId eventId();

    public abstract TodoId id();

    public abstract Optional<TodoId> parentId();

    public abstract String title();

}
