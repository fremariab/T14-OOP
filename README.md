# Climate Change Adaptation Strategies

## Overview
The effects of climate change on the environment, society, and economy are discussed in the program.The significance of havinge awareness of climate change's causes, effects, and solutions. In order to help users in adapting, the authors are building a comprehensive model that looks to address the causes of climate change. In order to give readers current and fact-checked content, the authors gather and curate information from a variety of sources, including scientific research, climate reports, and expert comments.The program talks about how climate change affects the environment, society, and other things. It highlights the need of having a complete understanding of the causes, effects, and solutions to climate change. The authors are developing an innovative and comprehensive model that aims to address the various causes of climate change in order to aid consumers in adapting. The authors collect and select material from a range of sources, such as scientific research, climate reports, and expert opinions, in order to provide users with current and fact-checked content.

This project models various climate change adaptation strategies using Java OOP principles. It provides a structured approach to analyzing the impact of renewable energy, environmental policies, and sustainable development in mitigating climate change.

Through different strategy classes, the program allows users to explore the benefits, limitations, and effectiveness of each approach.

---

## Features
- Adaptation Strategies – A base class representing different climate change strategies.
- Sustainable Development – Tracks goals, indicators, and implementation years.
- Renewable Energy – Predicts energy production for various renewable sources (solar, wind, hydro, etc.).
- Environmental Policy – Stores policy details, types, and descriptions.
- Simulation Execution – Runs a sample adaptation strategy in `ClimateChange.java`.

---

## Project Structure
```
ClimateChangeAdaptation
 ┣ AdaptationStrategies.java      // Base class for all strategies
 ┣ SustainableDevelopment.java    // Focuses on SDG goals & indicators
 ┣ RenewableEnergy.java           // Models renewable energy types
 ┣ EnvironmentalPolicy.java       // Represents environmental policies
 ┣ ClimateChange.java             // Main driver class
```

---

## How It Works

### Creating an Adaptation Strategy
Each adaptation strategy extends the `AdaptationStrategies` base class and contains specific fields & methods.

### Using the Renewable Energy Module
The program predicts energy output based on energy type:
```java
RenewableEnergy solar = new RenewableEnergy(
    "Solar Power", "Reduces carbon footprint", 
    "Weather-dependent", 89.5, "solar", 35, 1000
);
System.out.println("Predicted Production: " + solar.predictFutureEnergyProduction() + " MW");
```

### Environmental Policy Simulation
```java
EnvironmentalPolicy afforestation = new EnvironmentalPolicy(
    "Afforestation", "Increases green cover", 
    "Requires long-term commitment", 80.0, 
    "Tree Planting", "Planting new trees and replacing cut ones", "Conservation"
);
System.out.println("Policy Name: " + afforestation.getPolicyName());
```

### Sustainable Development Goals Tracker
```java
SustainableDevelopment sdg = new SustainableDevelopment(
    "Eco-Friendly Cities", "Improves air quality", 
    "High initial cost", 75.0, "CO2 Reduction", 
    "Net-zero carbon emissions", 2025
);
System.out.println("Goal: " + sdg.getGoals());
```

---

## Key Functionalities
| Class | Functionality |
|--------|-------------|
| `AdaptationStrategies` | Stores common attributes for strategies (benefits, limitations, success rate). |
| `SustainableDevelopment` | Tracks SDG goals, indicators, and implementation year. |
| `RenewableEnergy` | Predicts energy output based on the type (solar, wind, hydro, etc.). |
| `EnvironmentalPolicy` | Stores policy names, descriptions, and types. |
| `ClimateChange` | The main driver class to test implementations. |

---

## Future Enhancements
- Implement `evaluateImpact()` method to calculate success rates dynamically.
- Add real-time data integration for energy production estimates.
- Improve user interaction via a GUI or CLI interface.

---

## Authors
- Developed by: Aaron Obodai, Freda-Marie Beecham, Philip Mburu
---


