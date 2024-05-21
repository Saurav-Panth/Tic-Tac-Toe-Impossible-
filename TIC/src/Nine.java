public class Nine {

    public static void nine(String[][] var0) {
        boolean var1 = false;
        var0[0][2] = "[ X ]";
        Board.BoardReader(var0);
        var0[1][1] = "[ O ]";
        Board.BoardReader(var0);
        int var2 = backHand.here();
        if (var2 == 8) {
            var0[0][1] = "[ X ]";
            Board.BoardReader(var0);
            var0[0][0] = "[ O ]";
            Board.BoardReader(var0);
            var2 = backHand.here();
            if (var2 == 3) {
                var0[2][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][2] = "[ O ]";
                Board.BoardReader(var0);
                var2 = backHand.here();
                if (var2 == 4) {
                    var0[1][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][0] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[2][1] = "[ X ]";
                    Board.BoardReader(var0);
                } else if (var2 == 2) {
                    var0[2][1] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[1][0] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                } else {
                    var0[2][1] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[1][0] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                }
            } else if (var2 == 4) {
                var0[1][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 6) {
                var0[1][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 2) {
                var0[2][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else {
                var0[2][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
        }
        else if (var2 == 7) {
            var0[0][0] = "[ X ]";
            Board.BoardReader(var0);
            var0[0][1] = "[ O ]";
            Board.BoardReader(var0);
            var2 = backHand.here();
            if (var2 == 2) {
                var0[2][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][0] = "[ O ]";
                Board.BoardReader(var0);
                var2 = backHand.here();
                if (var2 == 6) {
                    var0[1][2] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][2] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[2][0] = "[ X ]";
                    Board.BoardReader(var0);
                    Board.BoardReader(var0);
                } else if (var2 == 1) {
                    var0[2][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[1][2] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                } else if (var2 == 3) {
                    var0[2][2] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[1][2] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                }
            } else if (var2 == 1) {
                var0[2][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][1] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 3) {
                var0[2][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][1] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 6) {
                var0[1][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][1] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else {
                var0[1][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][1] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
        }
        else if (var2 == 4) {
            var0[1][0] = "[ X ]";
            Board.BoardReader(var0);
            var0[0][0] = "[ O ]";
            Board.BoardReader(var0);
            var2 = backHand.here();
            if (var2 == 3) {
                var0[2][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][2] = "[ O ]";
                Board.BoardReader(var0);
                var2 = backHand.here();
                if (var2 == 2) {
                    var0[2][1] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][0] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[0][1] = "[ X ]";
                    Board.BoardReader(var0);
                } else if (var2 == 1) {
                    var0[2][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][1] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[0][1] = "[ X ]";
                    Board.BoardReader(var0);
                } else if (var2 == 8) {
                    var0[0][1] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][0] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[2][1] = "[ X ]";
                    Board.BoardReader(var0);
                }
            }
            else if (var2 == 8) {
                var0[0][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
            else if (var2 == 6) {
                var0[1][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
            else if (var2 == 1) {
                var0[2][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
            else if (var2 == 2) {
                var0[2][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
        }
        else if (var2 == 6) {
            var0[1][2] = "[ X ]";
            Board.BoardReader(var0);
            var0[2][2] = "[ O ]";
            Board.BoardReader(var0);
            var2 = backHand.here();
            if (var2 == 7) {
                var0[0][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[0][1] = "[ O ]";
                Board.BoardReader(var0);
                var2 = backHand.here();
                if (var2 == 2) {
                    var0[2][1] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[1][0] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[0][0] = "[ x ]";
                    Board.BoardReader(var0);
                }
                else if (var2 == 4) {
                    var0[1][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][1] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                }
                else if (var2 == 1) {
                    var0[2][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][1] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                }
            }
            else if (var2 == 4) {
                var0[1][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[0][0] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
            else if (var2 == 1) {
                var0[2][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[0][0] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
            else if (var2 == 2) {
                var0[2][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[0][0] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
            else if (var2 == 8) {
                var0[0][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[0][0] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
        }
        else if (var2 == 1) {
            var0[2][0] = "[ X ]";
            Board.BoardReader(var0);
            var0[0][1] = "[ O ]";
            Board.BoardReader(var0);
            var2 = backHand.here();
            if (var2 == 2) {
                var0[2][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var2 = backHand.here();
                if (var2 == 7) {
                    var0[0][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[1][0] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[1][2] = "[ X ]";
                    Board.BoardReader(var0);
                } else if (var2 == 4) {
                    var0[1][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[0][0] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                } else if (var2 == 6) {
                    var0[1][2] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[0][0] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                }
            } else if (var2 == 7) {
                var0[0][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][1] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 3) {
                var0[2][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][1] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 6) {
                var0[1][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][1] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 4) {
                var0[1][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][1] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
        }
        else if (var2 == 2) {
            var0[2][1] = "[ X ]";
            Board.BoardReader(var0);
            var0[1][0] = "[ O ]";
            Board.BoardReader(var0);
            var2 = backHand.here();
            if (var2 == 6) {
                var0[1][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[2][2] = "[ O ]";
                Board.BoardReader(var0);
                var2 = backHand.here();
                if (var2 == 7) {
                    var0[0][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[0][1] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[2][0] = "[ X ]";
                    Board.BoardReader(var0);
                } else if (var2 == 1) {
                    var0[2][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[0][0] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                } else if (var2 == 8) {
                    var0[0][1] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[0][0] = "[ O ]";
                    Board.BoardReader(var0);
                    var1 = true;
                }
            } else if (var2 == 8) {
                var0[0][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 7) {
                var0[0][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 1) {
                var0[2][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 3) {
                var0[2][2] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][2] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
        }
        else if (var2 == 3) {
            var0[2][2] = "[ X ]";
            Board.BoardReader(var0);
            var0[1][2] = "[ O ]";
            Board.BoardReader(var0);
            var2 = backHand.here();
            if (var2 == 4) {
                var0[1][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[0][0] = "[ O ]";
                Board.BoardReader(var0);
                var2 = backHand.here();
                if (var2 == 8) {
                    var0[0][1] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][1] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[2][0] = "[ X ]";
                    Board.BoardReader(var0);
                } else if (var2 == 1) {
                    var0[2][0] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][1] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[0][1] = "[ X ]";
                    Board.BoardReader(var0);
                } else if (var2 == 2) {
                    var0[2][1] = "[ X ]";
                    Board.BoardReader(var0);
                    var0[2][0] = "[ O ]";
                    Board.BoardReader(var0);
                    backHand.here();
                    var0[0][1] = "[ X ]";
                    Board.BoardReader(var0);
                }
            } else if (var2 == 1) {
                var0[2][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][0] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 2) {
                var0[2][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][0] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 7) {
                var0[0][0] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][0] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            } else if (var2 == 8) {
                var0[0][1] = "[ X ]";
                Board.BoardReader(var0);
                var0[1][0] = "[ O ]";
                Board.BoardReader(var0);
                var1 = true;
            }
        }

        if (var1) {
            backHand.Sleep(1.0);
            SimpleAudioPlayer.playGameLoss();
            System.out.println("\n\n\t\tSAURAV THE GREAT WON");
        } else {
            backHand.Sleep(0.5);
            SimpleAudioPlayer.playGameDraw();
            System.out.println("\n\n\t\tIT'S A DRAW");
        }

        Game.counter(var1);
    }
}
