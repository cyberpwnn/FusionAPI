package org.cyberpwn.fusionapi.registry;

/**
 * Represents registry types
 * 
 * @author cyberpwn
 */
public enum RegistryType
{
	/**
	 * Materials are blocks and items. These may take in textures, sounds, and
	 * models
	 */
	MATERIAL,
	
	/**
	 * Sounds are playable files located in the plugin and are passed into
	 * registries for packing
	 */
	SOUND,
	
	/**
	 * Textures are displayable files located in the plugin and are passed into
	 * registries for packing
	 */
	TEXTURE,
	
	/**
	 * Models are used to shape items and blocks
	 */
	MODEL,
	
	/**
	 * Shaders are used to change the player's shaders clientside
	 */
	SHADER;
}