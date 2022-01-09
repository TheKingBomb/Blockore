package fr.tkb.blockore.init;

import fr.tkb.blockore.utils.Utils;
import fr.tkb.blockore.init.ModStairsBlock;
import fr.tkb.blockore.init.ModPillarBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

	public static final ModBlocks INSTANCE = new ModBlocks();
	
	
// ====== AJOUT UTILITE OR ====== //
	// Bloc Lisse en or
	public static final Block GOLD_SMOOTH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES,2)
			.requiresTool()
			.strength(3f, 15f)
			.sounds(BlockSoundGroup.METAL));
	
	// Escalier Lisse en or
	public static final Block GOLD_SMOOTH_STAIRS = new ModStairsBlock(ModBlocks.GOLD_SMOOTH_BLOCK.getDefaultState(),
			FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES,2)
			.requiresTool()
			.strength(3f, 15f)
			.sounds(BlockSoundGroup.METAL));
	
	// Dalle lisse en or
	public static final Block GOLD_SMOOTH_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES,2)
			.requiresTool()
			.strength(3f, 15f)
			.sounds(BlockSoundGroup.METAL));
	
	// Bloc craquele en or
	public static final Block GOLD_CHISELED_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES,2)
			.requiresTool()
			.strength(3f, 15f)
			.sounds(BlockSoundGroup.METAL));
	
	// Pillier en or
	public static final Block GOLD_PILLAR_BLOCK = new ModPillarBlock(FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES,2)
			.requiresTool()
			.strength(3f, 15f)
			.sounds(BlockSoundGroup.METAL));
	
	// Briques en or
	public static final Block GOLD_BRICKS_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES,2)
			.requiresTool()
			.strength(3f, 15f)
			.sounds(BlockSoundGroup.METAL));
	
	// Escalier en brique en or
	public static final Block GOLD_BRICKS_STAIRS = new ModStairsBlock(ModBlocks.GOLD_BRICKS_BLOCK.getDefaultState(),
			FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES,2)
			.requiresTool()
			.strength(3f, 15f)
			.sounds(BlockSoundGroup.METAL));
	
	// Dalle en brique en or
	public static final Block GOLD_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
			.breakByTool(FabricToolTags.PICKAXES,2)
			.requiresTool()
			.strength(3f, 15f)
			.sounds(BlockSoundGroup.METAL));

// ====== FIN UTILITE OR ====== //
	
	
	// ====== AJOUT UTILITE FER ====== //
		// Bloc Lisse en fer
		public static final Block IRON_SMOOTH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Escalier Lisse en fer
		public static final Block IRON_SMOOTH_STAIRS = new ModStairsBlock(ModBlocks.IRON_SMOOTH_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Dalle lisse en fer
		public static final Block IRON_SMOOTH_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Bloc craquele en fer
		public static final Block IRON_CHISELED_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Pillier en fer
		public static final Block IRON_PILLAR_BLOCK = new ModPillarBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Briques en fer
		public static final Block IRON_BRICKS_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Escalier en brique en fer
		public static final Block IRON_BRICKS_STAIRS = new ModStairsBlock(ModBlocks.IRON_BRICKS_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Dalle en brique en fer
		public static final Block IRON_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));

	// ====== FIN UTILITE FER ====== //
		
		
	// ====== AJOUT UTILITE CHARBON ====== //
		// Bloc Lisse en charbon
		public static final Block COAL_SMOOTH_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Escalier Lisse en charbon
		public static final Block COAL_SMOOTH_STAIRS = new ModStairsBlock(ModBlocks.COAL_SMOOTH_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Dalle lisse en charbon
		public static final Block COAL_SMOOTH_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Bloc craquele en charbon
		public static final Block COAL_CHISELED_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Pillier en charbon
		public static final Block COAL_PILLAR_BLOCK = new ModPillarBlock(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Briques en charbon
		public static final Block COAL_BRICKS_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Escalier en brique en charbon
		public static final Block COAL_BRICKS_STAIRS = new ModStairsBlock(ModBlocks.COAL_BRICKS_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Dalle en brique en charbon
		public static final Block COAL_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.STONE));

	// ====== FIN UTILITE CHARBON ====== //
		
		
	// ====== AJOUT UTILITE EMERAUDE ====== //

		// Bloc Lisse en emeraude
		public static final Block EMERALD_SMOOTH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Escalier Lisse en emeraude
		public static final Block EMERALD_SMOOTH_STAIRS = new ModStairsBlock(ModBlocks.EMERALD_SMOOTH_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Dalle lisse en emeraude
		public static final Block EMERALD_SMOOTH_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Bloc craquele en emeraude
		public static final Block EMERALD_CHISELED_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Pillier en emeraude
		public static final Block EMERALD_PILLAR_BLOCK = new ModPillarBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Briques en emeraude
		public static final Block EMERALD_BRICKS_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Escalier en brique en emeraude
		public static final Block EMERALD_BRICKS_STAIRS = new ModStairsBlock(ModBlocks.EMERALD_BRICKS_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Dalle en brique en emeraude
		public static final Block EMERALD_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));

	// ====== FIN UTILITE EMERAUDE ====== //
		
		
	// ====== AJOUT UTILITE REDSTONE ====== //

		// Bloc Lisse en redstone
		public static final Block REDSTONE_SMOOTH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.luminance(4)
				.sounds(BlockSoundGroup.METAL));
		
		// Escalier Lisse en redstone
		public static final Block REDSTONE_SMOOTH_STAIRS = new ModStairsBlock(ModBlocks.REDSTONE_SMOOTH_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.luminance(4)
				.sounds(BlockSoundGroup.METAL));
		
		// Dalle lisse en redstone
		public static final Block REDSTONE_SMOOTH_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.luminance(4)
				.sounds(BlockSoundGroup.METAL));
		
		// Bloc craquele en redstone
		public static final Block REDSTONE_CHISELED_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.luminance(4)
				.sounds(BlockSoundGroup.METAL));
		
		// Pillier en REDSTONE
		public static final Block REDSTONE_PILLAR_BLOCK = new ModPillarBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.luminance(4)
				.sounds(BlockSoundGroup.METAL));
		
		// Briques en REDSTONE
		public static final Block REDSTONE_BRICKS_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.luminance(4)
				.sounds(BlockSoundGroup.METAL));
		
		// Escalier en brique en REDSTONE
		public static final Block REDSTONE_BRICKS_STAIRS = new ModStairsBlock(ModBlocks.REDSTONE_BRICKS_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.luminance(4)
				.sounds(BlockSoundGroup.METAL));
		
		// Dalle en brique en REDSTONE
		public static final Block REDSTONE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,0)
				.requiresTool()
				.strength(5f, 15f)
				.luminance(4)
				.sounds(BlockSoundGroup.METAL));

	// ====== FIN UTILITE REDSTONE ====== //
		
		
	// ====== AJOUT UTILITE LAPIS ====== //
		// Bloc Lisse en LAPIS
		public static final Block LAPIS_SMOOTH_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(3f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Escalier Lisse en LAPIS
		public static final Block LAPIS_SMOOTH_STAIRS = new ModStairsBlock(ModBlocks.LAPIS_SMOOTH_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(3f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Dalle lisse en LAPIS
		public static final Block LAPIS_SMOOTH_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(3f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Bloc craquele en LAPIS
		public static final Block LAPIS_CHISELED_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(3f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Pillier en LAPIS
		public static final Block LAPIS_PILLAR_BLOCK = new ModPillarBlock(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(3f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Briques en LAPIS
		public static final Block LAPIS_BRICKS_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(3f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Escalier en brique en LAPIS
		public static final Block LAPIS_BRICKS_STAIRS = new ModStairsBlock(ModBlocks.LAPIS_BRICKS_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(3f, 15f)
				.sounds(BlockSoundGroup.STONE));
		
		// Dalle en brique en LAPIS
		public static final Block LAPIS_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,1)
				.requiresTool()
				.strength(3f, 15f)
				.sounds(BlockSoundGroup.STONE));

	// ====== FIN UTILITE LAPIS ====== //
		
		
	// ====== AJOUT UTILITE DIAMANT ====== //
		// Bloc Lisse en DIAMANT
		public static final Block DIAMOND_SMOOTH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Escalier Lisse en DIAMANT
		public static final Block DIAMOND_SMOOTH_STAIRS = new ModStairsBlock(ModBlocks.DIAMOND_SMOOTH_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Dalle lisse en DIAMANT
		public static final Block DIAMOND_SMOOTH_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Bloc craquele en DIAMANT
		public static final Block DIAMOND_CHISELED_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Pillier en DIAMANT
		public static final Block DIAMOND_PILLAR_BLOCK = new ModPillarBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Briques en DIAMANT
		public static final Block DIAMOND_BRICKS_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Escalier en brique en DIAMANT
		public static final Block DIAMOND_BRICKS_STAIRS = new ModStairsBlock(ModBlocks.DIAMOND_BRICKS_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));
		
		// Dalle en brique en DIAMANT
		public static final Block DIAMOND_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL)
				.breakByTool(FabricToolTags.PICKAXES,2)
				.requiresTool()
				.strength(5f, 15f)
				.sounds(BlockSoundGroup.METAL));

	// ====== FIN UTILITE DIAMANT ====== //
		
		
	// ====== AJOUT UTILITE NETHERITE ====== //
		// Bloc Lisse en NETHERITE
		public static final Block NETHERITE_SMOOTH_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,3)
				.requiresTool()
				.strength(50f, 1200f)
				.sounds(BlockSoundGroup.NETHERITE));
		
		// Escalier Lisse en NETHERITE
		public static final Block NETHERITE_SMOOTH_STAIRS = new ModStairsBlock(ModBlocks.NETHERITE_SMOOTH_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,3)
				.requiresTool()
				.strength(50f, 1200f)
				.sounds(BlockSoundGroup.NETHERITE));
		
		// Dalle lisse en NETHERITE
		public static final Block NETHERITE_SMOOTH_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,3)
				.requiresTool()
				.strength(50f, 1200f)
				.sounds(BlockSoundGroup.NETHERITE));
		
		// Bloc craquele en NETHERITE
		public static final Block NETHERITE_CHISELED_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,3)
				.requiresTool()
				.strength(50f, 1200f)
				.sounds(BlockSoundGroup.NETHERITE));
		
		// Pillier en NETHERITE
		public static final Block NETHERITE_PILLAR_BLOCK = new ModPillarBlock(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,3)
				.requiresTool()
				.strength(50f, 1200f)
				.sounds(BlockSoundGroup.NETHERITE));
		
		// Briques en NETHERITE
		public static final Block NETHERITE_BRICKS_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,3)
				.requiresTool()
				.strength(50f, 1200f)
				.sounds(BlockSoundGroup.NETHERITE));
		
		// Escalier en brique en NETHERITE
		public static final Block NETHERITE_BRICKS_STAIRS = new ModStairsBlock(ModBlocks.NETHERITE_BRICKS_BLOCK.getDefaultState(),
				FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,3)
				.requiresTool()
				.strength(50f, 1200f)
				.sounds(BlockSoundGroup.NETHERITE));
		
		// Dalle en brique en NETHERITE
		public static final Block NETHERITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE)
				.breakByTool(FabricToolTags.PICKAXES,3)
				.requiresTool()
				.strength(50f, 1200f)
				.sounds(BlockSoundGroup.NETHERITE));

	// ====== FIN UTILITE NETHERITE ====== //

	
		
	
	//Registre des blocks
	public void registerAll()
	{
		register(GOLD_SMOOTH_BLOCK, new Identifier(Utils.MODID,"gold_smooth_block"));
		register(GOLD_SMOOTH_STAIRS, new Identifier(Utils.MODID,"gold_smooth_stairs"));
		register(GOLD_SMOOTH_SLAB, new Identifier(Utils.MODID,"gold_smooth_slab"));
		register(GOLD_CHISELED_BLOCK, new Identifier(Utils.MODID,"gold_chiseled_block"));
		register(GOLD_PILLAR_BLOCK, new Identifier(Utils.MODID,"gold_pillar_block"));
		register(GOLD_BRICKS_BLOCK, new Identifier(Utils.MODID,"gold_bricks_block"));
		register(GOLD_BRICKS_STAIRS, new Identifier(Utils.MODID,"gold_bricks_stairs"));
		register(GOLD_BRICKS_SLAB, new Identifier(Utils.MODID,"gold_bricks_slab"));
		
		register(IRON_SMOOTH_BLOCK, new Identifier(Utils.MODID,"iron_smooth_block"));
		register(IRON_SMOOTH_STAIRS, new Identifier(Utils.MODID,"iron_smooth_stairs"));
		register(IRON_SMOOTH_SLAB, new Identifier(Utils.MODID,"iron_smooth_slab"));
		register(IRON_CHISELED_BLOCK, new Identifier(Utils.MODID,"iron_chiseled_block"));
		register(IRON_PILLAR_BLOCK, new Identifier(Utils.MODID,"iron_pillar_block"));
		register(IRON_BRICKS_BLOCK, new Identifier(Utils.MODID,"iron_bricks_block"));
		register(IRON_BRICKS_STAIRS, new Identifier(Utils.MODID,"iron_bricks_stairs"));
		register(IRON_BRICKS_SLAB, new Identifier(Utils.MODID,"iron_bricks_slab"));
		
		register(COAL_SMOOTH_BLOCK, new Identifier(Utils.MODID,"coal_smooth_block"));
		register(COAL_SMOOTH_STAIRS, new Identifier(Utils.MODID,"coal_smooth_stairs"));
		register(COAL_SMOOTH_SLAB, new Identifier(Utils.MODID,"coal_smooth_slab"));
		register(COAL_CHISELED_BLOCK, new Identifier(Utils.MODID,"coal_chiseled_block"));
		register(COAL_PILLAR_BLOCK, new Identifier(Utils.MODID,"coal_pillar_block"));
		register(COAL_BRICKS_BLOCK, new Identifier(Utils.MODID,"coal_bricks_block"));
		register(COAL_BRICKS_STAIRS, new Identifier(Utils.MODID,"coal_bricks_stairs"));
		register(COAL_BRICKS_SLAB, new Identifier(Utils.MODID,"coal_bricks_slab"));
		
		register(EMERALD_SMOOTH_BLOCK, new Identifier(Utils.MODID,"emerald_smooth_block"));
		register(EMERALD_SMOOTH_STAIRS, new Identifier(Utils.MODID,"emerald_smooth_stairs"));
		register(EMERALD_SMOOTH_SLAB, new Identifier(Utils.MODID,"emerald_smooth_slab"));
		register(EMERALD_CHISELED_BLOCK, new Identifier(Utils.MODID,"emerald_chiseled_block"));
		register(EMERALD_PILLAR_BLOCK, new Identifier(Utils.MODID,"emerald_pillar_block"));
		register(EMERALD_BRICKS_BLOCK, new Identifier(Utils.MODID,"emerald_bricks_block"));
		register(EMERALD_BRICKS_STAIRS, new Identifier(Utils.MODID,"emerald_bricks_stairs"));
		register(EMERALD_BRICKS_SLAB, new Identifier(Utils.MODID,"emerald_bricks_slab"));
		
		register(REDSTONE_SMOOTH_BLOCK, new Identifier(Utils.MODID,"redstone_smooth_block"));
		register(REDSTONE_SMOOTH_STAIRS, new Identifier(Utils.MODID,"redstone_smooth_stairs"));
		register(REDSTONE_SMOOTH_SLAB, new Identifier(Utils.MODID,"redstone_smooth_slab"));
		register(REDSTONE_CHISELED_BLOCK, new Identifier(Utils.MODID,"redstone_chiseled_block"));
		register(REDSTONE_PILLAR_BLOCK, new Identifier(Utils.MODID,"redstone_pillar_block"));
		register(REDSTONE_BRICKS_BLOCK, new Identifier(Utils.MODID,"redstone_bricks_block"));
		register(REDSTONE_BRICKS_STAIRS, new Identifier(Utils.MODID,"redstone_bricks_stairs"));
		register(REDSTONE_BRICKS_SLAB, new Identifier(Utils.MODID,"redstone_bricks_slab"));
		
		register(DIAMOND_SMOOTH_BLOCK, new Identifier(Utils.MODID,"diamond_smooth_block"));
		register(DIAMOND_SMOOTH_STAIRS, new Identifier(Utils.MODID,"diamond_smooth_stairs"));
		register(DIAMOND_SMOOTH_SLAB, new Identifier(Utils.MODID,"diamond_smooth_slab"));
		register(DIAMOND_CHISELED_BLOCK, new Identifier(Utils.MODID,"diamond_chiseled_block"));
		register(DIAMOND_PILLAR_BLOCK, new Identifier(Utils.MODID,"diamond_pillar_block"));
		register(DIAMOND_BRICKS_BLOCK, new Identifier(Utils.MODID,"diamond_bricks_block"));
		register(DIAMOND_BRICKS_STAIRS, new Identifier(Utils.MODID,"diamond_bricks_stairs"));
		register(DIAMOND_BRICKS_SLAB, new Identifier(Utils.MODID,"diamond_bricks_slab"));
		
		register(LAPIS_SMOOTH_BLOCK, new Identifier(Utils.MODID,"lapis_smooth_block"));
		register(LAPIS_SMOOTH_STAIRS, new Identifier(Utils.MODID,"lapis_smooth_stairs"));
		register(LAPIS_SMOOTH_SLAB, new Identifier(Utils.MODID,"lapis_smooth_slab"));
		register(LAPIS_CHISELED_BLOCK, new Identifier(Utils.MODID,"lapis_chiseled_block"));
		register(LAPIS_PILLAR_BLOCK, new Identifier(Utils.MODID,"lapis_pillar_block"));
		register(LAPIS_BRICKS_BLOCK, new Identifier(Utils.MODID,"lapis_bricks_block"));
		register(LAPIS_BRICKS_STAIRS, new Identifier(Utils.MODID,"lapis_bricks_stairs"));
		register(LAPIS_BRICKS_SLAB, new Identifier(Utils.MODID,"lapis_bricks_slab"));
		
		register(NETHERITE_SMOOTH_BLOCK, new Identifier(Utils.MODID,"netherite_smooth_block"));
		register(NETHERITE_SMOOTH_STAIRS, new Identifier(Utils.MODID,"netherite_smooth_stairs"));
		register(NETHERITE_SMOOTH_SLAB, new Identifier(Utils.MODID,"netherite_smooth_slab"));
		register(NETHERITE_CHISELED_BLOCK, new Identifier(Utils.MODID,"netherite_chiseled_block"));
		register(NETHERITE_PILLAR_BLOCK, new Identifier(Utils.MODID,"netherite_pillar_block"));
		register(NETHERITE_BRICKS_BLOCK, new Identifier(Utils.MODID,"netherite_bricks_block"));
		register(NETHERITE_BRICKS_STAIRS, new Identifier(Utils.MODID,"netherite_bricks_stairs"));
		register(NETHERITE_BRICKS_SLAB, new Identifier(Utils.MODID,"netherite_bricks_slab"));

	}
		
	// Enregistrement block
	private void register(Block block, Identifier name)
	{
		Registry.register(Registry.BLOCK,name,block);
		createBlockItem(block,name);
	}
	
	// Construction bloc
	private void createBlockItem(Block block, Identifier name)
	{
		Registry.register(Registry.ITEM, name, new BlockItem(block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
