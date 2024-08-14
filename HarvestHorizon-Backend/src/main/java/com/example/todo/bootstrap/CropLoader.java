package com.example.todo.bootstrap;

import com.example.todo.model.*;
import com.example.todo.repositories.CropRepo;
import com.example.todo.repositories.FertRepo;
import com.example.todo.repositories.PestRepo;
import com.example.todo.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CropLoader implements CommandLineRunner {
    public final CropRepo cropRepo;
    private final FertRepo fertRepo;
    private final PestRepo pestRepo;

    public CropLoader(CropRepo cropRepo, FertRepo fertRepo,PestRepo pestRepo) {
        this.cropRepo = cropRepo;
        this.fertRepo = fertRepo;
        this.pestRepo = pestRepo;

    }

    @Override
    public void run(String... args) throws Exception {
        loadCrops();
        loadFertilizer();
        loadPesticides();



    }

    private void loadCrops() {
        if (cropRepo.count() == 0) {
            cropRepo.save(
                    CropModel.builder()
                            .name("Wheat")
                            .crop_type(CropType.CEREAL)
                            .season(Season.WINTER)
                            .price(100.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.SANDY_LOAM)
                            .description("Wheat is a key cereal crop known for its role as a staple food worldwide")
                            .build());
                    CropModel.builder()
                            .name("Rice")
                            .crop_type(CropType.CEREAL)
                            .season(Season.SUMMER)
                            .price(180.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.LOAM)
                            .description("It is a cereal grain grown in waterlogged fields known as paddies, thriving in warm, tropical, and subtropical climates")
                            .build();
                    CropModel.builder()
                            .name("Corn(maize)")
                            .crop_type(CropType.CEREAL)
                            .season(Season.SUMMER)
                            .price(300.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.LOAM)
                            .description(" It typically grows to about 2-3 meters tall and has large, broad leaves.")
                            .build();
                    CropModel.builder()
                            .name("Soyabeans")
                            .crop_type(CropType.LEGUME)
                            .season(Season.SUMMER)
                            .price(200.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.LOAM)
                            .description("The plants typically grow about 30-90 cm tall, with trifoliate leaves and small white or purple flowers")
                            .build();
                    CropModel.builder()
                            .name("Barley")
                            .crop_type(CropType.CEREAL)
                            .season(Season.SPRING)
                            .price(200.00)
                            .landsize(LandSize.SMALL)
                            .soilType(SoilType.LOAM)
                            .description("The plant typically grows 60-100 cm tall and has narrow, grass-like leaves. ")
                            .build();
                    CropModel.builder()
                            .name("Oats")
                            .crop_type(CropType.CEREAL)
                            .season(Season.SPRING)
                            .price(200.00)
                            .landsize(LandSize.SMALL)
                            .soilType(SoilType.LOAM)
                            .description("The plant typically grows 60-120 cm tall, with broad leaves and loose, elongated seed heads.")
                            .build();
                    CropModel.builder()
                            .name("Rye")
                            .crop_type(CropType.CEREAL)
                            .season(Season.SUMMER)
                            .price(190.00)
                            .landsize(LandSize.SMALL)
                            .soilType(SoilType.LOAM)
                            .description("The plant typically reaches 90-150 cm in height and has narrow, pointed leaves. ")
                            .build();
                    CropModel.builder()

                            .name("Sorghum")
                            .crop_type(CropType.CEREAL)
                            .season(Season.SPRING)
                            .price(100.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.LOAM)
                            .description(" It's well-suited to hot, dry climates and can thrive in poor soil conditions.")
                            .build();
                    CropModel.builder()
                            .name("Millet")
                            .crop_type(CropType.CEREAL)
                            .season(Season.SUMMER)
                            .price(100.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.LOAM)
                            .description(" It’s a staple food in many parts of Africa and Asia and is valued for its high nutritional content, including protein, fiber, and essential minerals")
                            .build();
                    CropModel.builder()
                            .name("Sugarcane")
                            .crop_type(CropType.CASH)
                            .season(Season.WINTER)
                            .price(200.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.LOAM)
                            .description("Beyond sugar production, sugarcane is also used to produce ethanol for biofuel and can be processed into molasses and rum")
                            .build();
                    CropModel.builder()
                            .name("Cotton")
                            .crop_type(CropType.CASH)
                            .season(Season.SUMMER)
                            .price(300.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.SANDY_LOAM)
                            .description(" Cotton plants thrive in warm climates with plenty of sunshine and well-drained soil.")
                            .build();
                    CropModel.builder()
                            .name("Tomatoes")
                            .crop_type(CropType.VEGETABLE)
                            .season(Season.SUMMER)
                            .price(200.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.SANDY_LOAM)
                            .description("They come in various colors, including red, yellow, and orange, and can be eaten raw in salads or cooked in sauces, soups")
                            .build();
                    CropModel.builder()
                            .name("Potatoes")
                            .crop_type(CropType.VEGETABLE)
                            .season(Season.SUMMER)
                            .price(300.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.SANDY_LOAM)
                            .description("They have a starchy texture and come in several types, including russet, red, and fingerling. ")
                            .build();
                    CropModel.builder()

                            .name("Carrots")
                            .crop_type(CropType.VEGETABLE)
                            .season(Season.SPRING)
                            .price(100.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.SANDY_LOAM)
                            .description("They're rich in beta-carotene, which the body converts into vitamin A, supporting vision and immune function")
                            .build();
                    CropModel.builder()
                            .name("Onions")
                            .crop_type(CropType.VEGETABLE)
                            .season(Season.SPRING)
                            .price(100.00)
                            .landsize(LandSize.LARGE)
                            .soilType(SoilType.SANDY_LOAM)
                            .description("Onions are rich in vitamins C and B6, antioxidants, and sulfur compounds that contribute to their distinctive taste and aroma")
                            .build();


            System.out.println("Sample Crops Loaded");
        }
    }

    private void loadFertilizer() {//                    private void loadFertilizers() {
        if (fertRepo.count() == 0) {
            fertRepo.save(
                    Fertilizer.builder()
                            .name("UREA")
                            .type("CHEMICAL")
                            .price(100.00)
                            .description("Urea is a nitrogen-rich fertilizer for boosting plant growth.")
                            .crop(cropRepo.findById(1).orElseThrow())
                            .build());
                    Fertilizer.builder()
                            .name("DAP")
                            .type("CHEMICAL")
                            .price(300.00)
                            .description("DAP is a high-phosphorus fertilizer for robust plant growth.")
                            .crop(cropRepo.findById(1).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("UREA")
                            .type("CHEMICAL")
                            .price(100.00)
                            .description("Urea is a nitrogen-rich fertilizer for boosting plant growth.")
                            .crop(cropRepo.findById(2).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("UREA")
                            .type("CHEMICAL")
                            .price(100.00)
                            .description("Urea is a nitrogen-rich fertilizer for boosting plant growth.")
                            .crop(cropRepo.findById(2).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("NPK")
                            .type("CHEMICAL")
                            .price(600.00)
                            .description("NPK fertilizer provides essential nutrients: nitrogen, phosphorus, and potassium.")
                            .crop(cropRepo.findById(2).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("AMMONIUM NITRATE")
                            .type("CHEMICAL")
                            .price(700.00)
                            .description("Ammonium nitrate is a high-nitrogen fertilizer that promotes rapid plant growth.")
                            .crop(cropRepo.findById(3).orElseThrow())
                            .build();
                    Fertilizer.builder()

                            .name("POTASH")
                            .type("CHEMICAL")
                            .price(800.00)
                            .description("Potash is a potassium-rich fertilizer that enhances plant health and disease resistance.")
                            .crop(cropRepo.findById(3).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("SOYBEAN MEAL")
                            .type("ORGANIC")
                            .price(1000.00)
                            .description("Soybean meal is a protein-rich organic fertilizer.")
                            .crop(cropRepo.findById(4).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("NPK")
                            .type("CHEMICAL")
                            .price(600.00)
                            .description("NPK fertilizer provides essential nutrients: nitrogen, phosphorus, and potassium.")
                            .crop(cropRepo.findById(4).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("UREA")
                            .type("CHEMICAL")
                            .price(100.00)
                            .description("Urea is a nitrogen-rich fertilizer for boosting plant growth.")
                            .crop(cropRepo.findById(5).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("SUPERPHOSPHATE")
                            .type("CHEMICAL")
                            .price(1250.00)
                            .description("Superphosphate is a phosphorus-rich fertilizer that promotes root development.")
                            .crop(cropRepo.findById(5).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("UREA")
                            .type("CHEMICAL")
                            .price(100.00)
                            .description("Urea is a nitrogen-rich fertilizer for boosting plant growth.")
                            .crop(cropRepo.findById(6).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("NPK")
                            .type("CHEMICAL")
                            .price(600.00)
                            .description("NPK fertilizer provides essential nutrients: nitrogen, phosphorus, and potassium.")
                            .crop(cropRepo.findById(6).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("AMMONIUM NITRATE")
                            .type("CHEMICAL")
                            .price(700.00)
                            .description("Ammonium nitrate is a high-nitrogen fertilizer that promotes rapid plant growth.")
                            .crop(cropRepo.findById(7).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("DAP")
                            .type("CHEMICAL")
                            .price(300.00)
                            .description("DAP is a high-phosphorus fertilizer for robust plant growth.")
                            .crop(cropRepo.findById(7).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("UREA")
                            .type("CHEMICAL")
                            .price(100.00)
                            .description("Urea is a nitrogen-rich fertilizer for boosting plant growth .")
                            .crop(cropRepo.findById(8).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("NPK")
                            .type("CHEMICAL")
                            .price(600.00)
                            .description("NPK fertilizer provides essential nutrients: nitrogen, phosphorus, and potassium .")
                            .crop(cropRepo.findById(8).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("UREA")
                            .type("CHEMICAL")
                            .price(100.00)
                            .description("Urea is a nitrogen-rich fertilizer for boosting plant growth.")
                            .crop(cropRepo.findById(9).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("NPK")
                            .type("CHEMICAl")
                            .price(600.00)
                            .description("NPK fertilizer provides essential nutrients: nitrogen, phosphorus, and potassium .")
                            .crop(cropRepo.findById(9).orElseThrow())
                            .build();
                    Fertilizer.builder()
                            .name("NPK")
                            .type("CHEMICAL")
                            .price(600.00)
                            .description("NPK fertilizer provides essential nutrients: nitrogen, phosphorus, and potassium .")
                            .crop(cropRepo.findById(10).orElseThrow())
                            .build();








            System.out.println("Sample Fertilizer Loaded");
        }
    }private void loadPesticides() {
        if (pestRepo.count() == 0) {
            pestRepo.save(
                    Pesticide.builder()
                            .name("GLYPHOSATE")
                            .type("HERBICIDE")
                            .price(100.00)
                            .description("Glyphosate is a broad-spectrum herbicide used to control weeds and grasses.")
                            .crop(cropRepo.findById(1).orElseThrow())
                            .build());
                    Pesticide.builder()
                            .name("CHLORPYRIFOS")
                            .type("INSECTICIDE")
                            .price(150.00)
                            .description("Chlorpyrifos is an insecticide used to control a variety of pests in agriculture.")
                            .crop(cropRepo.findById(1).orElseThrow())
                            .build();
                    Pesticide.builder()
                            .name("PROPANIL")
                            .type("HERBICIDE")
                            .price(120.00)
                            .description("Propanil is a selective herbicide used to control weeds in rice fields.")
                            .crop(cropRepo.findById(2).orElseThrow())
                            .build();
                    Pesticide.builder()
                            .name("PROPANIL")
                            .type("HERBICIDE")
                            .price(120.00)
                            .description("Propanil is a selective herbicide used to control weeds in rice fields.")
                            .crop(cropRepo.findById(2).orElseThrow())
                            .build();



//
//                                .name("PROPANIL")
//                                .type("HERBICIDE")
//                                .price(120.00)
//                                .description("Propanil is a selective herbicide used to control weeds in rice fields.")
//                                .crop(cropRepo.findById(10).orElseThrow())
//                                .build();
//                        Pesticide.builder()
//                                .name("BIFENTHRIN")
//                                .Pesticide_type(Pesticide_type.INSECTICIDE)
//                                .Price(120.00)
//                                .Description("Bifenthrin is a broad-spectrum insecticide used to control pests in crops, lawns, and gardens..")
//                                .Crop_id("2");
//                        Pesticide.builder()
//                                .name("ATRAZINE")
//                                .Pesticide_type(Pesticide_type.HERBICIDE)
//                                .Price(100.00)
//                                .Description("Atrazine is a herbicide used to control weeds in corn and sugarcane fields.")
//                                .Crop_id("3");
//                        Pesticide.builder()
//                                .name("CYPERMETHRIN")
//                                .Pesticide_type(Fertilizer_type.INSECTICIDE)
//                                .Price(190.00)
//                                .Description("Cypermethrin is a synthetic pyrethroid insecticide used to control a wide range of pests.")
//                                .Crop_id("3");
//                        Pesticide.builder()
//                                .name("GLYPHOSATE")
//                                .Pesticide_type(Pesticide_type.HERBICIDE)
//                                .Price(100.00)
//                                .Description("Glyphosate is a broad-spectrum herbicide used to control weeds and grasses..")
//                                .Crop_id("4");
//                        Pesticide.builder()
//                                .name("CHLORPYRIFOS")
//                                .type(Pesticide_type.INSECTICIDE)
//                                .price(150.00)
//                                .description("Chlorpyrifos is an insecticide used to control a variety of pests in agriculture.")
//                                .Crop_id("4");
//                        Pesticide.builder()
//                                .name("PROPICONAZOLE")
//                                .Pesticide("FUNGICIDE")
//                                .Price(240.00)
//                                .Description("Propiconazole is a fungicide used to control various fungal diseases in crops.")
//                                .Crop_id("5");
//                        Pesticide.builder()
//                                .name("CHLOROTHALONIL")
//                                .Pesticide_type(Pesticide_type.FUNGICIDE)
//                                .Price(300.00)
//                                .Description("Chlorothalonil is a fungicide for various crops.")
//                                .Crop_id("5");
//                        Pesticide.builder()
//                                .name("BROMOXYNIL")
//                                .Pesticide_type(Pesticide_type.HERBICIDE)
//                                .Price(300.00)
//                                .Description("Bromoxynil is a herbicide used to control broadleaf weeds in cereals and grasses.")
//                                .Crop_id("6");
//                        Pesticide.builder()
//                                .name("METSULFURON")
//                                .Pesticide_type(Pesticide_type.HERBICIDE)
//                                .Price(350.00)
//                                .Description("Metsulfuron is a herbicide for broadleaf weeds and grasses..")
//                                .Crop_id("6");
//                        Pesticide.builder()
//                                .name("MCPA")
//                                .Pesticide_type(Pesticide_type.HERBICIDEL)
//                                .Price(230.00)
//                                .Description("MCPA is a herbicide used to control broadleaf weeds in cereals and grasses.")
//                                .Crop_id("7");
//                        Pesticide.builder()
//                                .name("2,4-D")
//                                .Pesticide_type(Pesticide_type.HERBICIDE)
//                                .Price(230.00)
//                                .Description("2,4-D is a herbicide used to control broadleaf weeds in crops and lawns..")
//                                .Crop_id("7");
//                        Pesticide.builder()
//                                .name("MALATHION")
//                                .Pesticides_type(Pesticide_type.INSECTICIDE)
//                                .Price(100.00)
//                                .Description(" Malathion is an insecticide used to control pests on crops, animals, and in homes.")
//                                .Crop_id("8");
//                        Pesticide.builder()
//                                .name("CARBARYL")
//                                .type("INSECTICIDE")
//                                .price(230.00)
//                                .description("Carbaryl is an insecticide for various pests..")
//                                .Crop_id("8");
//                        Pesticide.builder()
//                                .name("DIMETHOATE")
//                                .Pesticide_type(Pesticide_type.INSECTICIDE)
//                                .Price(100.00)
//                                .Description("Dimethoate is an insecticide used to control a range of pests in crops.")
//                                .Crop_id("9");
//                        Pesticide.builder()
//                                .name("ENDOSULFAN")
//                                .Pesticide_type(Pesticide_type.INSECTICIDE)
//                                .Price(100.00)
//                                .Description("Endosulfan is an insecticide and acaricide used to control pests on crops..")
//                                .Crop_id("9");
//                        Pesticide.builder()
//                                .name("CHLORPYRIFOS")
//                                .Pesticide_type(Pesticide_type.INSECTICIDE)
//                                .Price(150.00)
//                                .Description("Chlorpyrifos is an insecticide used to control a variety of pests in agriculture .")
//                                .Crop_id("10");




                        System.out.println("Sample Pesticides Loaded");
                    }
                }
            }






