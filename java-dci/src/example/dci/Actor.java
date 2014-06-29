package example.dci;

/**
 * Data object performs a role in a context 
 */
public interface Actor {
	default Role actAs(Class<? extends Role> role) throws Exception {
		return role.newInstance().apply(this);
	}
}
