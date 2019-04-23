package saleh_case_study;


    /**
     * Car Radio implementation
     *
     * TODO limit frequency for each band
     * TODO add constructor (initial state)
     */
    public class Radio {
        private final Integer MAX_CHANNELS = 6;

        Channel channels[];
        private Integer currentFrequency;
        private Integer currentVolume;
        Band currentBand;

        final Integer MIN_FR_FM1 = 88 ;
        final Integer MAX_FR_FM1 = 108 ;
        final Integer MIN_FR_AM = 55;
        final Integer MAX_FR_AM = 172;



        public Radio(Channel channels[], Integer currentFrequency, Integer currentVolume, Band currentBand ){

            this.channels = channels;
            if(currentBand == Band.FM1 | currentBand == Band.FM2) {
                while (currentFrequency>MIN_FR_FM1 || currentFrequency < MAX_FR_FM1) {
                    this.currentFrequency = currentFrequency;
                }
            }else if (currentBand == Band.AM){
                while (currentFrequency > MIN_FR_AM || currentFrequency < MAX_FR_AM){
                    this.currentFrequency = currentFrequency;
                }
            }

            this.currentVolume = currentVolume;
            this.currentBand = currentBand;


        }



        // getter method
        public Integer getCurrentFrequency() {
            return currentFrequency;
        }

        // setter method
        public void setCurrentFrequency(Integer currentFrequency) {
            this.currentFrequency = currentFrequency;
        }

        // getter method
        public Integer getCurrentVolume() {
            return currentVolume;
        }

        // setter method
        public void setCurrentVolume(Integer currentVolume) {
            this.currentVolume = currentVolume;
        }
        

        public void volumeUp() {
            currentVolume++;
        }
        void volumeDown() {
            currentVolume--;
        }

        void tuneUp() {
            currentFrequency++;
        }
        void tuneDown() {
            currentFrequency--;
        }

        void switchBand(Band band) {
            currentBand = band;
        }



        /**
         * Finds next tune
         * Seek left off due to complexity
         *
         */
        void seekUp() {

        //    Band b1 = Band.FM1;
        //    Band b2 = Band.FM2;
        //    Band b3 = Band.AM;

          //  if(Band b1)
            //    for (int frequency , 88 < frequency < 108;  frequency++;)
              //      currentFrequency = getCurrentFrequency();

        //    switch(Band){
        //        case FM1: {
        //            88 < currentFrequency < 108;
        //            currentFrequency++;
        //            break;
        //        }
        //        case FM2: {
        //            88 < currentFrequency < 108;
        //            currentFrequency++;
        //            break;
        //        }
        //        case AM: {
        //            55 < currentFrequency < 172;
        //            currentFrequency++;
        //            break;
        //        }


            if(currentBand == Band.FM1 | currentBand == Band.FM2) {
                while (currentFrequency>MIN_FR_FM1 || currentFrequency < MAX_FR_FM1) {
                    currentFrequency++;
                }


                }else if(currentBand == Band.AM){
                while (currentFrequency> MIN_FR_AM || currentFrequency < MAX_FR_AM){
                    currentFrequency++;
                }
            }

            }


        void seekDown() {

        //    switch(Band){
        //        case FM1: {
        //            88 < currentFrequency < 108;
        //            currentFrequency--;
        //            break;
        //        }
        //        case FM2: {
        //            88 < currentFrequency < 108;
        //            currentFrequency--;
        //            break;
        //        }
        //        case AM: {
        //            55 < currentFrequency < 172;
        //            currentFrequency--;
        //            break;
        //        }

         //   }

            if(currentBand == Band.FM1 | currentBand == Band.FM2) {
                while (currentFrequency>MIN_FR_FM1 || currentFrequency < MAX_FR_FM1) {
                    currentFrequency--;
                }


            }else if(currentBand == Band.AM){
                while (currentFrequency> MIN_FR_AM || currentFrequency < MAX_FR_AM){
                    currentFrequency--;
                }
            }

        }

        void saveChannel(Integer position) {
            if (position < MAX_CHANNELS ) {
                Channel channel = new Channel(Band.FM1 , 88); //??????
                channel.band = currentBand;
                channel.frequency = currentFrequency;//??????
                channels[position] = channel;
            }
        }


    }

    /**
     * Holds a channel's state
     * TODO make fields private
     * TODO add getters and setters
     */
    class Channel {
        Band band;
        final Integer MIN_FREQUENCY = 3;
        final Integer MAX_FREQUNCY = 3000;
        private Integer frequency;



        // constructor
        public Channel(Band band, Integer frequency) {
            this.band = band;
            this.frequency = frequency;
        }

        // getter method
        public Integer getFrequency() {
            return frequency;
        }

        // setter method
        public void setFrequency(Integer frequency) {

            if(frequency > MIN_FREQUENCY || frequency< MAX_FREQUNCY)
            this.frequency = frequency;
        }


    }

    enum Band {FM1,FM2,AM}
