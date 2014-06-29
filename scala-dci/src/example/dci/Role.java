package example.dci;

/**
 * A Specific Role represents the behavior of a Domain Object in a Context 
 */
public interface Role {
	Role apply(Actor actor); 
}
